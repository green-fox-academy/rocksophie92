package Model;

import View.Frame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Demagorgon {
  Image demagorgonPic;
  int vx=7;
  int vy=7;

  public Demagorgon() {
    try {
      demagorgonPic = ImageIO.read(new File("demagorgon.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void demagorgonMovement(int Dx, int Dy, int xEnd, int yEnd) {

    if (Dx < 0 || xEnd - 60 < Dx) {
      vx = -vx;
    } else {
      Dx += vx;
    }

    if (Dy < 0 || yEnd - 60 < Dy) {
      vy = -vy;
    } else {
      Dy += vy;
    }
  }

public void drawDemagorgon(Graphics2D g2, int x, int y) {
  g2.drawImage(demagorgonPic, x, y, 60, 60, null);
}
}
