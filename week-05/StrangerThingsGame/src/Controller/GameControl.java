package Controller;

import View.Frame;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameControl extends JFrame { public static void main(String[] args) { new GameControl(); }

Frame panel = new Frame();

  public GameControl() {
    super();
    addKeyListener(new KeyListener() {

      @Override
      public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'd') {
          panel.rightMovement();
        }
        if (e.getKeyChar() == 'a') {
          panel.leftMovement();
        }
        if (e.getKeyChar() == 's') {
          panel.downMovement();
        }
        if (e.getKeyChar() == 'w') {
          panel.upMovement();
        }
      }

      @Override
      public void keyReleased(KeyEvent e) {

        if (e.getKeyChar() == 'd') {
          panel.horizontalStop();
        }
        if (e.getKeyChar() == 'a') {
          panel.horizontalStop();
        }
        if (e.getKeyChar() == 's') {
          panel.verticalStop();
        }
        if (e.getKeyChar() == 'w') {
          panel.verticalStop();
        }
      }

      @Override
      public void keyPressed(KeyEvent e) {

        if (e.getKeyChar() == 'd') {
          panel.horizontalStop();
        }
        if (e.getKeyChar() == 'a') {
          panel.horizontalStop();
        }
        if (e.getKeyChar() == 's') {
          panel.verticalStop();
        }
        if (e.getKeyChar() == 'w') {
          panel.verticalStop();
        }
      }
    });

    setContentPane(panel);
    setSize(1000, 1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
}
