// Multiple try catch blocks

public class MTC {
    public static void main(String[] args) {
        try {
            // int a = 10, b = 0, c;
            int a = 10, b = 2, c;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("can't divide by zero");
        }
        try {
            int a[] = { 10, 20, 30 };
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("beyond the array limit");
        }

        System.out.println("End of program");
    }
}