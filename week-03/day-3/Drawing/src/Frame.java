import javax.swing.*;

public class Frame {

  public static void main(String[] args) {
    new Frame();
  }

  public Frame() {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Drawing d = new Drawing();
    frame.add(d);
    frame.setSize(d.getWidth(), d.getHeight());
    frame.setVisible(true);

  }

}
