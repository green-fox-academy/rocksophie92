package View;

import Model.Tile;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame extends JPanel {

  BufferedImage background, player, demogorgon, path, wall, eggos;
  int x = 0, y = 0, vx = 0, vy = 0;
  int xD = 0, yD = 0, vxD = 5, vyD = 0, xP = 0, yP = 0, xW = 0, yW = 0;
  Tile pathTile = new Tile(path, 100, xP, yP);
  Tile wallTile = new Tile(wall, 100, xW, yW);


  public void leftMovement() {
    vx -= 5;
  }

  public void rightMovement() {
    vx += 5;
  }

  public void upMovement() {
    vy -= 5;
  }

  public void downMovement() {
    vy += 5;
  }

  public void horizontalStop() {
    vx = 0;
  }

  public void verticalStop() {
    vy = 0;
  }

  public Frame() {
    super();

    try {
      background = ImageIO.read(new File("st_bg.jpg"));
      player = ImageIO.read(new File("heroes.png"));
      demogorgon = ImageIO.read(new File("demogorgon.png"));
      path = ImageIO.read(new File("tilePath.jpg"));
      wall = ImageIO.read(new File("tileWall.png"));
      eggos = ImageIO.read(new File("eggos.png"));

    } catch (IOException e) {
      e.printStackTrace();
    }

    new Thread(new Runnable() {

      @Override
      public void run() {
        while (true) {
          try {
            Thread.sleep(30);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          x += vx;

          if (x < 0) {
            vx = -vx;
            x = player.getWidth() / 10;
          } else if (x + player.getWidth() / 10 > 1000) {
            vx = -vx;
            x = 1000 - player.getWidth() / 10;
          }

          y += vy;

          if (y < 0) {
            vy = -vy;
            y = player.getHeight() / 10;
          } else if (y + player.getHeight() / 10 > 1000) {
            vy = -vy;
            y = 1000 - player.getHeight() / 10;
          }

          xD += vxD;

          if (xD < 0 || 620 - player.getWidth() / 10 < xD) {
            vxD = -vxD;
          }
          yD += vyD;
          if (yD < 0 || 1000 - player.getHeight() / 10 < yD) {
            vyD = -vyD;
          }
          repaint();
        }
      }
    }).start();
  }

  public void paint(Graphics g) {
    Map mapDraw = new Map();
    Graphics2D g2 = (Graphics2D) g;
    g2.fillRect(0, 0, 1000, 1000);
    g2.drawImage(background, 0, 0, 1000, 1000, null);

    for(int i = 0; i < 10; i ++){
      for(int j = 0; j < 10; j ++){
        if(mapDraw.mapChar[i][j] == '0'){
          mapDraw.map[i][j] = pathTile;
          //g2.drawImage(path, i * 100, j * 100, 100, 100, null);
        } else if (mapDraw.mapChar[i][j] == '1'){
          mapDraw.map[i][j] = wallTile;
          g2.drawImage(wall, i * 100, j * 100, 100, 100, null);
        }
      }
    }

    g2.drawImage(eggos, 25, 625, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(eggos, 625, 525, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(eggos, 925, 825, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(player, x, y, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(demogorgon, xD+120, yD+120, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.setColor(Color.BLACK);
  }
}
