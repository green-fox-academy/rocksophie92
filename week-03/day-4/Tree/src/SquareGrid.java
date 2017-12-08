import java.awt.*;
import java.util.Random;

public class SquareGrid {

  // plot an H, centered on (x, y) of the given side length
  public static void drawFox(double x, double y, double size) {

    // compute the coordinates of the 4 tips of the H
    double x0 = x - size/2;
    double x1 = x + size/2;
    double y0 = y - size/2;
    double y1 = y + size/2;

     // draw the 3 line segments of the H

    StdDraw.line(x1, y0, x1, y1);    // right vertical segment of the H
    StdDraw.line(x0, y0, x0, y1);    // left  vertical segment of the H
    StdDraw.line(x0,  y1, x1,  y1);    // connect the two vertical segments of the H
    StdDraw.line(x0, y0, x1, y0);
  }

  // plot an order n H-tree, centered on (x, y) of the given side length
  public static void draw(int n, double x, double y, double size) {
    Random r = new Random();
    if (n == 0) return;
    drawFox(x, y, size);

    // compute x- and y-coordinates of the 4 half-size H-trees
    double x0 = x - size/2;
    double x1 = x + size/2;
    double y0 = y - size/2;
    double y1 = y + size/2;

    // recursively draw 4 half-size H-trees of order n-1
    draw(n-1, x0, y0, size/2);    // lower left  H-tree
    draw(n-1, x0, y1, size/2);    // upper left  H-tree
    draw(n-1, x1, y0, size/2);    // lower right H-tree
    draw(n-1, x1, y1, size/2);    // upper right H-tree
  }

  // reads an integer command-line argument n and plots an order n H-tree
  public static void main(String[] args) {
    int n = 4;
            //Integer.parseInt(args[0]);

    double x = 0.5, y = 0.5;   // center of H-tree
    double size = 0.5;         // side length of H-tree

   // StdDraw.setPenColor(Color.PINK);
   // starDrawer(size*2);

    draw(n, x, y, size);
  }

  public static void connectTheDots(int arrayStart0, int arrayStart1, int arrayEnd0, int arrayEnd1) {
    StdDraw.line(arrayStart0+100, arrayStart1-55, arrayEnd0+100, arrayEnd1-55);
  }

  public static void starDrawer (double size) {
    double width = size;
    double height = size;
    StdDraw.setPenColor(Color.BLACK);
    StdDraw.line(width / 2, 0, width / 2, height / 1);
    StdDraw.line(0, height / 2, width / 1, height / 2);
    StdDraw.setPenColor(Color.RED);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(width / 2, i * width / 20, (10 - i) * width / 20, height / 2);
    }
    StdDraw.setPenColor(Color.GREEN);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(width / 2, i * width / 20, (10 + i) * width / 20, height / 2);
    }
    StdDraw.setPenColor(Color.YELLOW);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(width / 2, (i + 10) * width / 20, (i) * width / 20, height / 2);
    }
    StdDraw.setPenColor(Color.BLUE);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(width / 2, (10 + i) * width / 20, (20 - i) * width / 20, height / 2);
    }
  }

}