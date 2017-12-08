import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class main {

  public static void main(String[] args) {

    Path filePath = Paths.get("whatever.txt");

    new Thread(new Runnable() {
      @Override
      public void run() {

        for (int i = 0; i < 10; i++) {
          System.out.println(i + "_whatever");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }).start();
  }
}


