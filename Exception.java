public class Exception{
  public static void main(String[] args) throws ArithmeticException {
    try {
      int a = 10;
      int b = 0;
      if(b == 0){
        throw new ArithmeticException("You cannot divide by zero");
      }
      System.out.println(a/b);
      
    } catch (ArithmeticException e) {
      System.out.println("Exception occured "+e);
    }
  }
}
