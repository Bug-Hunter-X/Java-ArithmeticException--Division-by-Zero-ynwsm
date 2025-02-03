public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0; // Initialize to avoid compilation error

        if (y != 0) {
            z = x / y;
        } else {
            System.out.println("Error: Division by zero"); // Handle the error gracefully
        }
        System.out.println(z);
    }
}