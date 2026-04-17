package workshop5;


public class qs1 {
    public static void main(String[] args) {
        
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero.");
        }
    }
}