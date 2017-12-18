package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame extends JPanel {

  BufferedImage background, player, demagorgon, path, wall;
  int x = 0, y = 0, vx = 0, vy = 0;
  int xD = 0, yD = 0, vxD = 5, vyD = 0;


  public void xDMovement(int newVxD) {
    if (Math.abs(newVxD) < 6) {
      vxD = newVxD;
    }
  }

  public void yDMovement(int newVyD) {
    if (Math.abs(newVyD) < 6) {
      vyD = newVyD;
    }
  }

  public void xMovement(int newVx) {
    if (Math.abs(newVx) < 6) {
      vx = newVx;
    }
  }

  public void yMovement(int newVy) {
    if (Math.abs(newVy) < 6) {
      vy = newVy;
    }
  }

  public Frame() {
    super();

    try {
      background = ImageIO.read(new File("st_bg.jpg"));
      player = ImageIO.read(new File("heroes.png"));
      demagorgon = ImageIO.read(new File("demagorgon.png"));
      path = ImageIO.read(new File("tilePath.jpg"));
      wall = ImageIO.read(new File("tileWall.png"));
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
          if (x < 1000 - player.getWidth() / 10 && x >= 0) {
            x += vx;
          } /*else if (x >=1000-player.getWidth()/10 || x < 0) {
            xMovement(0);
          }*/

          if (y < 1000 - player.getHeight() / 10 && y >= 0) {
            y += vy;
          } /*else if (y >=1000-player.getHeight()/10 || y < 0) {
            yMovement(0);
          }*/

          if (xD < 1000 - player.getWidth() / 10 && xD >= 0) {
            xD += vxD;
          } /*else if (xD >=1000-player.getWidth()/10 || xD < 0) {
            xD -= vxD;
          }*/

          if (yD < 1000 - player.getHeight() / 10 && yD >= 0) {
            yD += vyD;
          } /*else if (yD >=1000-player.getHeight()/10 || yD < 0) {
            yD -= vyD;
          }*/
          repaint();
        }
      }
    }).start();
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.fillRect(0, 0, 1000, 1000);
    g2.drawImage(background, 0, 0, 1000, 1000, null);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g2.drawImage(path, i * 100, j * 100, 100, 100, null);
      }
    }
    g2.drawImage(player, x, y, player.getWidth() / 10, player.getHeight() / 10, null);
    g2.drawImage(demagorgon, xD, yD, player.getWidth() / 10, player.getHeight() / 10, null);

  }
}
