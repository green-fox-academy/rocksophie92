package Model;

import java.awt.*;

public class Tile {
Image image;
  int size;
  int x;
  int y;

  public Tile(Image image, int size, int x, int y) {
    this.image = image;
    this.size = size;
    this.x = x;
    this.y = y;
  }
}
