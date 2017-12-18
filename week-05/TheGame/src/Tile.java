import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tile {

  Board board = new Board(800);

  int tileSize = board.boardSize/10;
  int posX;
  int posY;
  Image pathImage;
  Image wallImage;

  public Tile(int tileSize, int posX, int posY) {
    this.tileSize = tileSize;
    this.posX = posX;
    this.posY = posY;
  }

  public Tile() {

  }

  public Image tileType(String input) {
    boolean isWall;
    String wall = "w";
    String path = "f";

      if (input.equals(wall)) {
        isWall = true;
        try {
          wallImage = ImageIO.read(new File("tileWall.png"));
        } catch (IOException e) {
          e.printStackTrace();
        } return wallImage;
      } else {
        isWall = false;
        try {
          pathImage = ImageIO.read(new File("tilePath.jpg"));
        } catch (IOException e) {
          e.printStackTrace();
        } return pathImage;
      }
    }
  }
