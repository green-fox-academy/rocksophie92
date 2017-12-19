package View;

import Model.Tile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {

  File file = new File("map.txt");
  List<String> mapPattern;
  Tile wallTile;
  Tile pathTile;
  Tile[][] map = new Tile[10][10];
  Image path;
  Image wall;
  String tileCoordinates;
  int Px = 0, Py = 0, Wx = 0, Wy = 0;
  char[][] mapChar;

  public Map() {
    mapPattern = new ArrayList<>();
    mapPattern();
    try {
      path = ImageIO.read(new File("tilePath.jpg"));
      wall = ImageIO.read(new File("tileWall.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    wallTile = new Tile(wall, 100, Wx, Wy);
    pathTile = new Tile(path, 100, Px, Py);
  }

  public String mapPattern() {
    Scanner s;
    mapChar = new char[10][10];

    try {
      s = new Scanner(file);
      while (s.hasNextLine()) {
        mapPattern.add(s.nextLine());
      }
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          mapChar[i][j] = mapPattern.get(j).toCharArray()[i];
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return tileCoordinates;
  }
}
