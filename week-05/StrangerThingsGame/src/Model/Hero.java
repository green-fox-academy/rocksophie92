package Model;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Hero {

  int x;
  int y;
  int vx;
  int vy;
  int life =3;



  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getVx() {
    return vx;
  }

  public int getVy() {
    return vy;
  }

  public void setLife(int life) {
    this.life = life;
  }

  public int getLife() {

    return life;
  }
}
