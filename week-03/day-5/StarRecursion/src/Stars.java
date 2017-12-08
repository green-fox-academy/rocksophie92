import java.awt.*;

public class Stars {

  int canvasWidth = 800;
  int canvasHeight = 800;

  public int getCanvasWidth() {
    return canvasWidth;
  }

  public int getCanvasHeight() {
    return canvasHeight;
  }

  // plot an H, centered on (x, y) of the given side length
  public static void drawStar(double x, double y, double size) {

    StdDraw.setPenColor(Color.BLUE);
    /*StdDraw.line(x, 0, x, y * 2);
    StdDraw.line(0, y, x * 2, y);*/
    StdDraw.setPenColor(Color.RED);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(x, i * size / 10, (10 - i) * size / 10, y);
    }
    StdDraw.setPenColor(Color.GREEN);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(x, i * size / 10, (10 + i) * size / 10, y);
    }
    StdDraw.setPenColor(Color.YELLOW);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(x, (i + 10) * size / 10, (i) * size / 10, y);
    }
    StdDraw.setPenColor(Color.BLUE);
    for (int i = 0; i < 10; i++) {
      StdDraw.line(x, (10 + i) * size / 10, (20 - i) * size / 10, y);
    }
  }

  public static void draw(int n, double x, double y, double size) {
    if (n == 0) return;
    drawStar(x, y, size);

    double xTopLeft = x - size / 2;
    double yTopLeft = y - size / 2;
    double xTopRight = x + size / 2;
    double yTopRight = y - size / 2;
    double xBottomLeft = x - size / 2;
    double yBottomLeft = y + size / 2;
    double xBottomRight = x + size / 2;
    double yBottomRight = y + size / 2;

    //draw(n - 1, xTopLeft, yTopLeft, size / 2);
    draw(n - 1, xTopRight, yTopRight, size / 2);
    //draw(n - 1, xBottomLeft, yBottomLeft, size / 2);
    //draw(n - 1, xBottomRight, yBottomRight, size / 2);
  }

  public static void main(String[] args) {
    Stars stars = new Stars();
    StdDraw.setCanvasSize(stars.canvasWidth, stars.canvasHeight);
    draw(3, 0.5, 0.5, 0.5);
  }
}
