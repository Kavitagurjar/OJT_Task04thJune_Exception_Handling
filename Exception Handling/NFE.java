
// Number format exception
public class NFE {

    public static void main(String[] args) {

        // String str = "kavita";
        // String str = "123456";
        String str = "kavita@123";

       try
       { int a = Integer.parseInt(str);
        System.out.println(a);
        System.err.println("String NumberFormatException");
       }
       catch(NumberFormatException e)
       {
           System.out.println("String " + str + " can't be converted to integer");
       }
       System.err.println("End of program");
    }

      
    
}
