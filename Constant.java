/*
 * How to declare constant variabel in java
 * 
 * User all Upper letters
 * Key words = public static final
 */

public class Constant {
    static final String NAME = "Nabin"; // class variable
    // static final String NAM;         // field NAM must be initialized at class level
    public static void main(String []args){
        // declare constant
        final int AGE;
        AGE = 24;       // you can initialize variable declared with final access modifier
        System.out.println(AGE); 
        //age = 31; // you cannot reassign the value to age variable
        System.out.println(NAME);
       // NAME = "NK";  // you cannot re-assign value to final constant variable
    }
}
