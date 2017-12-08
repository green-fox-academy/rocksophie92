import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
  int height=800;
  int width = 800;

  @Override
  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.BLACK);



drawALine(100, 100, 280, 100, g, Color.RED);

  }
  public void drawALine(int x1, int y1, int x2, int y2, Graphics g, Color color) {
int lineLength=x2-x1;
    g.setColor(color);
    g.drawLine(x1, y1, x2, y1);
    g.setColor(Color.BLUE);
    g.drawLine(x1, y1, x1+lineLength/3, y1);
    g.drawLine(x1+2*lineLength/3, y1, x2, y1);
    //g.drawLine(x1+lineLength/3, );
  }

}
