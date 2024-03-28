/*
 * Wrapper class is used instead of primitive data types.
 * Each data type has its own Wrapper class
 * Wrapper class is used with Generics -> Ex. ArrayList, LinkedList
 */

public class WrapperClass {
    public static void main(String []args){
        Integer i = 10;
        Double d = 3.14;
        Character c = 'N';
        Long l = 12l; // Or 12L
        Short s = 24;
        Float f = 3.14f; // Or 3.14F
        Byte b = 87;  // like integer but a smaller number
        Boolean bol = false;

        System.out.println("Wrapper Class values are: ");
        System.out.printf("Intiger = %d \n" + 
        "Double = %.2f \n" +
        "Character = %s \n" +
        "Long = %d \n" +
        "Short = %d \n" +
        "Float = %.3f \n" +
        "Byte = %d \n" +
        "Boolean = %b \n",
        i, d, c, l, s, f, b, bol);
    }
}
