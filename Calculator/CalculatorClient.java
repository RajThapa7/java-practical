import java.rmi.Naming;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            // Look up the remote object
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            // Test the calculator methods
            int a = 10;
            int b = 5;
            System.out.println("Addition: " + calculator.add(a, b));
            System.out.println("Subtraction: " + calculator.subtract(a, b));
            System.out.println("Multiplication: " + calculator.multiply(a, b));
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (Exception e) {
            System.err.println("Calculator Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

