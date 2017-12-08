import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Drawing extends JPanel {
  int height = 800;
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
    int[] polygonXPoints = new int[]{30, 40, 50, 60, 70};
    int[] polygonYPoints = new int[]{20, 30, 40, 50, 60};


    int[][] allDots= new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};



    this.setBackground(Color.BLACK);

   /* g.setColor(Color.CYAN);
    g.setColor(Color.MAGENTA);
    g.drawLine(0,0,200,300);
    g.setColor(Color.RED);
    g.drawOval(40, 40, 40, 40);
    g.setColor(Color.BLUE);
    g.fillOval(70, 70, 40, 40);
    g.setColor(Color.ORANGE);
    g.drawPolygon(polygonXPoints, polygonYPoints, 5);*/
/*    g.setColor(Color.RED);
    g.drawLine(0, height / 2, width, height / 2);
    g.setColor(Color.GREEN);
    g.drawLine(width / 2, 0, width / 2, height);
    g.setColor(Color.BLUE);
    g.drawLine(40, 40, 40, 100);
    g.setColor(Color.YELLOW);
    g.drawLine(40, 40, 100, 40);
    g.setColor(Color.GREEN);
    g.drawLine(100, 40, 100, 100);
    g.setColor(Color.RED);
    g.drawLine(40, 100, 100, 100);
    g.setColor(Color.GREEN);
    g.drawLine(0, 0, width, height);
    g.drawLine(0, height, width, 0);
    lineDrawer(100, 40, 40, 100, Color.CYAN, g);
    for (int i = 1; i < 4; i++) {
      // centerLiner(50+300*i, 70+300*i, width / 2, height / 2, g, Color.BLUE);
      //  horizonDrawer(200, 100+i*100, g, Color.MAGENTA);
      // rectDrawerTwo(600, 500+i*100, g);
      // centerRect((200+i*200)/i, g);
    }*/
   /* g.setColor(Color.GREEN);
    g.fillRect(width / 2 - 5, height / 2 - 5, 10, 10);

    for (int i = 0; i < 4; i++) {
      //  rectDrawer(30+i*100, 30+i*70, 200+i*30, 200+i*40, g);
    }
   */
/*    for (int i = 0; i < 10; i+=width/5) {
      for (int j = 0; j < 10; j++) {
        if (i+j % 2 == 0) {
            checkerBoardDrawer(i * width / 10, j * height / 10, width / 10, height / 10, g);
          }
         // checkerBoardDrawer(i* width / 10, j * height / 10, width / 10, height / 10, g);
      }


    } *//*

    for (int i = 0; i <6; i++) {
      rectDrawer((i*50)*2^i, (i*50)*2^i, i*50, i*50, g);
    }*/

   /* for (int i = 0; i < width/10; i++) {
      for (int j = 0; j < height/10; j++) {
        checkerBoardDrawer(i*width/10, i*height/10, width/10, height/10, g);

      }
*/

/*    for (int i = 0; i < width / 20+1; i++) {
      centerLiner(i * 20, 0, g, Color.RED);
      centerLiner(0, i * 20, g, Color.RED);
      centerLiner(i * 20, height, g, Color.BLUE);
      centerLiner(width, i * 20, g, Color.BLUE);
    }*/
// STAR DRAWING
    lineDrawer( width/2, 0, width/2, height/1, Color.MAGENTA, g);
    lineDrawer(0, height/2, width/1,height/2, Color.magenta, g);
    for (int i = 0; i <10 ; i++) {
      lineDrawer(width/2, i*width/20, (10-i)*width/20, height/2, Color.MAGENTA, g);
    }
    for (int i = 0; i <10 ; i++) {
      lineDrawer(width/2, i*width/20, (10+i)*width/20, height/2, Color.MAGENTA, g);
    }
    for (int i = 0; i <10 ; i++) {
      lineDrawer(width/2, (i+10)*width/20, (i)*width/20, height/2, Color.MAGENTA, g);
    }
    for (int i = 0; i <10 ; i++) {
      lineDrawer(width/2, (10+i)*width/20, (20-i)*width/20, height/2, Color.MAGENTA, g);
    }

    // CONNECT THE DOTS

    for (int i = 0; i < allDots.length-1; i++) {
      for (int j = 0; j < allDots[i].length-1; j++) {
        connectTheDots(allDots[i][j],allDots[i][j+1],allDots[i+1][j], allDots[i+1][j+1], g, Color.BLUE);
    }
    }

    lineDrawer(dot1[0], dot1[1], dot2[0], dot2[1], Color.BLUE, g);
    lineDrawer(dot2[0], dot2[1], dot3[0], dot3[1], Color.BLUE, g);
    lineDrawer(dot3[0], dot3[1], dot4[0], dot4[1], Color.BLUE, g);
    lineDrawer(dot4[0], dot4[1], dot5[0], dot5[1], Color.BLUE, g);
    lineDrawer(dot5[0], dot5[1], dot6[0], dot6[1], Color.BLUE, g);
    lineDrawer(dot6[0], dot6[1], dot7[0], dot7[1], Color.BLUE, g);
    lineDrawer(dot7[0], dot7[1], dot8[0], dot8[1], Color.BLUE, g);
    lineDrawer(dot8[0], dot8[1], dot1[0], dot1[1], Color.BLUE, g);
   /* connectTheDots(dot1, dot2, g, Color.BLUE);
    connectTheDots(dot2, dot3, g, Color.BLUE);
    connectTheDots(dot3, dot4, g, Color.BLUE);
    connectTheDots(dot4, dot5, g, Color.BLUE);
    connectTheDots(dot5, dot6, g, Color.BLUE);
    connectTheDots(dot6, dot7, g, Color.BLUE);
    connectTheDots(dot7, dot8, g, Color.BLUE);
    connectTheDots(dot8, dot1, g, Color.BLUE);*/

    drawHexagon(200, 200, g, Color.GREEN); // bottom
    drawHexagon(248, 172, g, Color.GREEN); // bottom right
    drawHexagon(152, 172, g, Color.GREEN); // bottom left
    drawHexagon(200, 144, g, Color.GREEN); // middle
    drawHexagon(152, 116, g, Color.GREEN); // top left
    drawHexagon(248, 116, g, Color.GREEN); // top right
    drawHexagon(200, 88, g, Color.GREEN);  // top

    drawHexagon(200, 200, g, Color.GREEN); //
    drawHexagon(248, 172, g, Color.GREEN); //
    drawHexagon(152-48, 172+28, g, Color.GREEN); //
    drawHexagon(200-56-32-8, 144, g, Color.GREEN); //
    drawHexagon(152-48, 116-28, g, Color.GREEN); //
    drawHexagon(248, 116, g, Color.GREEN); //
    drawHexagon(200, 88, g, Color.GREEN);  //
  }


  public static void lineDrawer(int x1, int y1, int x2, int y2, Color color, Graphics g) {

    g.setColor(color);
    g.drawLine(x1, y1, x2, y2);
  }

  public static void centerLiner(int x1, int y1, Graphics g, Color color) {
    Drawing d = new Drawing();
    d.getHeight();
    d.getWidth();
    g.setColor(color);
    g.drawLine(x1, y1, d.getWidth() / 2, d.getHeight() / 2);
  }

  public static void horizonDrawer(int x1, int y1, Graphics g, Color color) {
    g.setColor(color);
    g.drawLine(x1, y1, x1 + 50, y1);
  }

  public static void rectDrawer(int x1, int y1, int width, int height, Graphics g) {
    Random r = new Random();
    g.setColor(Color.getHSBColor(r.nextFloat(), r.nextFloat(), r.nextFloat()));

    g.fillRect(x1, y1, width, height);
  }

  public static void checkerBoardDrawer(int x1, int y1, int width, int height, Graphics g) {
    g.setColor(Color.white);
    g.fillRect(x1, y1, width, height);
  }

  public static void rectDrawerTwo(int x1, int y1, Graphics g) {
    Random r = new Random();
    g.setColor(Color.getHSBColor(r.nextFloat(), r.nextFloat(), r.nextFloat()));
    g.fillRect(x1, y1, 50, 50);
  }

  public static void centerRect(int size, Graphics g) {
    Drawing d = new Drawing();
    int canvasWidth = d.getWidth();
    int canvasHeight = d.getHeight();
    Random r = new Random();

    g.setColor(Color.getHSBColor(r.nextFloat(), r.nextFloat(), r.nextFloat()));
    g.fillRect(canvasWidth / 2 - size / 2, canvasHeight / 2 - size / 2, size, size);
  }
public static void connectTheDots(int arrayStart0, int arrayStart1, int arrayEnd0, int arrayEnd1, Graphics g, Color color) {
  g.setColor(color);
  g.drawLine(arrayStart0+100, arrayStart1-55, arrayEnd0+100, arrayEnd1-55);
}

public static void drawHexagon (int x1, int y1, Graphics g, Color color) {
  int h =32;
  int x2 = x1+h;

  int radius = h/2;
  int mx = x1+h/2;
  int b= 28;
  int my = y1+b;


    g.setColor(color);
  g.drawLine(x1, y1, x2, y1);
  g.drawLine(x1, y1+2*b, x2, y1+2*b);
  g.drawLine(x1, y1, mx-h, my);
  g.drawLine(mx-h, my, x1, y1+2*b);
  g.drawLine(x2,y1+2*b,mx+h, my);
  g.drawLine(mx+h, my, x2, y1);

}


}
