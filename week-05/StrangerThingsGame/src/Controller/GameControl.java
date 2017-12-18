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
          panel.xMovement(5);
        }
        if (e.getKeyChar() == 'a') {
          panel.xMovement(-5);
        }
        if (e.getKeyChar() == 's') {
          panel.yMovement(5);
        }
        if (e.getKeyChar() == 'w') {
          panel.yMovement(-5);
        }
      }

      @Override
      public void keyReleased(KeyEvent e) {

        if (e.getKeyChar() == 'd') {
          panel.xMovement(0);
        }

        if (e.getKeyChar() == 'a') {
          panel.xMovement(0);
        }

        if (e.getKeyChar() == 's') {
          panel.yMovement(0);
        }

        if (e.getKeyChar() == 'w') {
          panel.yMovement(0);
        }

      }

      @Override
      public void keyPressed(KeyEvent e) {


      }
    });

    setContentPane(panel);
    setSize(500,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

}
