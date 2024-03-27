public class Primitives {
    public static void main(String[]args){
        int age = 10;
        double price = 3.14;
        float cost = 16.67f; // 16.67F
        short shortNum = 14;
        long longNum = 24;
        char character = 'A'; // single quote for char and double quote for String
        boolean bol = true;

        String name = "Nabin Niroula"; // String is not a primitive data type

        // display them all on console
        /* 
         * Format specifier is as follows
         *  int = %d
         *  double = %f, %.2f for two decimal places
         *  float = %f
         *  boolean = %b
         *  long = %d
         *  short = %d
         *  character = %s
         * String = %s, or %S
         * 
         */
        System.out.printf("The values are as follows: \n" +
        "   Age is %d \n"  +
        "   Price is %.2f \n" +   
        "   Cost is %.3f \n" +
        "   Short Number is %d \n" + 
        "   Long Number is %d \n" + 
        "   Character is %s \n" +
        "   Boolean value is %b \n" +
        "   Name is %s \n",
        age, price, cost, shortNum, longNum, character, bol, name);
    }
}
