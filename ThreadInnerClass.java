// public class ThreadInnerClass {
//   public static void main(String[] args) {
//     Thread thread = new Thread(){
//       public void run(){
//         System.out.println("Running on thread using anonymous inner class");
//       }
//     };
//     thread.start();
//     System.out.println("Running on main program");
//   }
// }

public class ThreadInnerClass {
  public static void main(String[] args) {
    Runnable runnable = new Runnable(){
      public void run(){
        System.out.println("Running on thread using anonymous inner class");
      }
    };
    Thread thread  = new Thread(runnable);
    thread.start();
    System.out.println("Running on main program");
  }
}
