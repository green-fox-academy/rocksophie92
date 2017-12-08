import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Panel panel = new Panel();
    frame.add(panel);
    frame.setSize(panel.getWidth(), panel.getHeight());
    frame.setVisible(true);
    for(int i = 0; i < args.length; i++) {
      System.out.println("args: "+args[i]);
    }
    System.out.println(Arrays.toString(args));
  }
}
