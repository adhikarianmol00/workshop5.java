package workshop5;



public class qs2 {
    
    public static void printAge() throws ArrayIndexOutOfBoundsException {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
        System.out.println(age[9]); 
    }

    public static void main(String[] args) {
        try {
            printAge();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Array index is out of bounds.");
        }
    }
}
