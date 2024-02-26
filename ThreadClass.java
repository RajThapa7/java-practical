public class ThreadClass extends Thread{
  public static void main(String[] args) {
    ThreadClass thread = new ThreadClass();
    thread.start();
    System.out.println("This is running on the main program");
  }

  public void run(){
    System.out.println("This is running on a thread");
  }
}
