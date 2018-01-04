package Model;

import java.awt.*;

public class Tile {
Image image;
  int size;
  int x;
  int y;
  TileTypes tileType;

  public Tile(Image image, int size, int x, int y, TileTypes tileType) {
    this.image = image;
    this.size = size;
    this.x = x;
    this.y = y;
    this.tileType  = tileType;
  }
}
