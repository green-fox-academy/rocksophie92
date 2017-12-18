import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class GameField {

  public static void main(String[] args) {
    new GameField();
  }

  Board board = new Board();


  public GameField() {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Board b = new Board();
    frame.add(b);
    frame.setSize(b.boardSize, b.boardSize);
    frame.setVisible(true);


    addKeyListener(new KeyListener() {

      @Override
      public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub


      }

      @Override
      public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        if (e.getKeyChar() == 'd') {
          b.xSpeedSetup(0);
        }

        if (e.getKeyChar() == 'a') {
          b.xSpeedSetup(0);
        }

        if (e.getKeyChar() == 's') {
          b.ySpeedSetup(0);
        }

        if (e.getKeyChar() == 'w') {
          b.ySpeedSetup(0);
        }

      }

      @Override
      public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if (e.getKeyChar() == 'd') {
          b.xSpeedSetup(5);
        }
        if (e.getKeyChar() == 'a') {
          b.xSpeedSetup(-5);
        }
        if (e.getKeyChar() == 's') {
          b.ySpeedSetup(5);
        }
        if (e.getKeyChar() == 'w') {
          b.ySpeedSetup(-5);
        }
      }
    });

  }


}


