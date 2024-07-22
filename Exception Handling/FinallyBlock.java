public class FinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println("NSTI Dehradun");
            int a = 20, b = 2, c;
            c = a / b;
            System.out.println(c);
            System.err.println("ADIT Batch");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("End of program");
    }
}
    