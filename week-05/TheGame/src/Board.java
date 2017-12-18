import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

public class Board extends JPanel {
  int boardSize = 800;
  public Tile[][] map;
  BufferedImage tiles, hero;
  String f = "f";
  String w = "w";
  int x = 0, y = 0, vx = 0, vy = 0;

  Image pathImage;


  public void xSpeedSetup(int newVx) {
    if (Math.abs(newVx) < 6) {
      vx = newVx;
    }
  }

  public void ySpeedSetup(int newVy) {
    if (Math.abs(newVy) < 6) {
      vy = newVy;
    }
  }

  public void readFiles(File file) {
    Tile tile = new Tile();
    String line = "";
    try {
      Scanner s = new Scanner(file);
      while (s.hasNextLine()) {
        for (int i = 0; i < 10; i++) {
          line = s.nextLine();
        }
        for (int i = 0; i < line.toCharArray().length; i++) {
          if (line.charAt(i) == f.charAt(0)) {
            tile.tileType("f");
          } else if (line.charAt(i) == w.charAt(0)) {
            tile.tileType("w");
          }
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public Board(int boardSize) {
    this.boardSize = boardSize;
  }

  public Board() {
    super();


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
          y += vy;
          repaint();
        }
      }
    }).start();

  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Tile tile = new Tile();
    Image[][] map = new Image[][]{};
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g2.drawImage(tile.tileType(f), i*80, i*80, null);

      }


    }

  }
}