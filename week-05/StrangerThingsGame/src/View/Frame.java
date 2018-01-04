package View;

import Model.Demogorgon;
import Model.Hero;
import Model.Tile;
import Model.TileTypes;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame extends JPanel {

  BufferedImage background, player, demogorgon, path, wall, eggos;
  int x = 0, y = 0, vx = 0, vy = 0;
  int xP = 0, yP = 0, xW = 0, yW = 0;

  int[] position;
  Tile pathTile = new Tile(path, 100, xP, yP, TileTypes.Path);
  Tile wallTile = new Tile(wall, 100, xW, yW, TileTypes.Wall);
  Demogorgon d1 = new Demogorgon(true);
  Demogorgon d2 = new Demogorgon(false);
  Demogorgon d3 = new Demogorgon(true);
  Hero hero = new Hero();

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

  public void setSpeed() {
    d1.setVxD(7);
    d1.setVyD(0);
    d2.setVxD(0);
    d2.setVyD(7);
    d3.setVxD(7);
    d3.setVyD(0);
  }

  public void associateX() {
    x = hero.getX();
    vx = hero.getVx();
  }

  public void associateY() {
    y = hero.getY();
    vy = hero.getVy();
  }

  public void fight() {
    int lifeCount = hero.getLife();
    if (player.getTileGridXOffset()+player.getWidth() == demogorgon.getTileGridXOffset()+demogorgon.getWidth()) {
      lifeCount--;
      hero.setLife(lifeCount);
    }
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

    setSpeed();
    associateX();
    associateY();
    new Thread(() -> {
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

        d1.demogorgonPatrol(650, 1000);
        d2.demogorgonPatrol(1000, 550);
        d3.demogorgonPatrol(550, 1000);
        System.out.println(hero.getLife());
        repaint();
        fight();
      }
    }).start();
  }


  public void paint(Graphics g) {
    Map mapDraw = new Map();
    Graphics2D g2 = (Graphics2D) g;
    g2.fillRect(0, 0, 1000, 1000);
    g2.drawImage(background, 0, 0, 1000, 1000, null);

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapDraw.mapChar[i][j] == '0') {
          mapDraw.map[i][j] = pathTile;
          //g2.drawImage(path, i * 100, j * 100, 100, 100, null);
        } else if (mapDraw.mapChar[i][j] == '1') {
          mapDraw.map[i][j] = wallTile;
          g2.drawImage(wall, i * 100, j * 100, 100, 100, null);
        }
      }
    }

    g2.drawImage(eggos, 25, 625, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(eggos, 625, 525, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(eggos, 925, 825, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(player, x, y, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(demogorgon, d1.getX() + 120, d1.getY() + 120, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(demogorgon, d2.getX() + 320, d2.getY() + 220, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(demogorgon, d3.getX() + 320, d3.getY() + 925, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawString("0", 50, 950);
  }
}
