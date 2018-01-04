package Model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Demogorgon {
  Image demogorgonPic;
  private int x;
  private int y;
  int vxD;
  int vyD;
  boolean isHorizontal;

  public Demogorgon(int x, int y, int vxD, int vyD, boolean isHorizontal) {
    this.x = x;
    this.y = y;
    this.vxD = vxD;
    this.vyD = vyD;
    this.isHorizontal = isHorizontal;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean isHorizontal() {
    return isHorizontal;
  }

  public void setVxD(int vxD) {
    this.vxD = vxD;
  }

  public void setVyD(int vyD) {
    this.vyD = vyD;
  }

  public Demogorgon(boolean isHorizontal) {
    this.isHorizontal = isHorizontal;
  }

  public Demogorgon() {
    try {
      demogorgonPic = ImageIO.read(new File("demogorgon.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public void demogorgonPatrol(int xDend, int yDend) {


    System.out.println("xDen: " + xDend);
    System.out.println("yDen: " + yDend);
    System.out.println("vxD: " + vxD);
    System.out.println("vyD: " + vyD);
    System.out.println("x: " + x);
    System.out.println("y: " + y);

    x += vxD;
    if (x < 0 || x >= xDend - 60) {
      vxD *=-1;
    }
    y += vyD;
    if (y < 0 || y >= yDend - 60) {
      vyD = -vyD;
    }
  }

  public void drawDemagorgon(Graphics2D g2, int x, int y) {
    g2.drawImage(demogorgonPic, x, y, 60, 60, null);
  }
}
