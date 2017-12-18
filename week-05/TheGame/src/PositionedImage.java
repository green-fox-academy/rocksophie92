import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

public class PositionedImage {

  BufferedImage image;
  BufferedImage resizedImage;
  int posX, posY;

  public PositionedImage(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public Image draw(Graphics graphics, int width, int height) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
      resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      Graphics2D g = resizedImage.createGraphics();
      g.drawImage(image, 0, 0, width, height, null);
      g.dispose();
    }
  return resizedImage;
  }
}