public class ThreadInterface implements Runnable {
  public static void main(String[] args) {
   ThreadInterface obj = new ThreadInterface();
   Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This is running on main program");
  }

  public void run(){
    System.out.println("This is running on a thread");
  }
  
}
