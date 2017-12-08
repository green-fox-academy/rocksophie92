public class threadTest extends Thread {

@Override
  public void run() {

  for (int i = 0; i < 10; i++) {

    System.out.println(i + " whatever");

  }
  try {
    Thread.sleep(200);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
}
}
