/*
* Arrays in Java -> 1D, 2D
*/

import java.util.Arrays; // use Arrays.toString(arrName) to print array

class ArrayConcepts{
    /**
     * 
     * @return array of Strings
     */
    public String[] getProgrammingLangs(){
        String languages[]; // Declare an array
        languages = new String[5]; // initialize an array

        languages[0] = "Pava";
        languages[1] = "Python";
        languages[4] = "C++";
        languages[3] = "C#";
        languages[2] = "JavaScript";

        return languages;
    }

    /**
     * 
     * @return array of floating point numbers
     */
    public double[] initializeArrayInOneGo(){
        double[] floats = {2.4, 3.8, 4.2, 4.8};
        return floats;
    }

    /**
     * uses forEach loop print out array elements
     * @return returns nothing.
     */
    public void useForEachLoop(){
        int[] evenIntegers = {2, 4, 6, 8, 10};
        for(int number: evenIntegers){
            System.out.print(number);
            System.out.print(",");
        }
        System.out.println();
    }
}


/*
 * Main class
 */
public class ArraysInJava {
    public static void main(String[]args){
        System.out.println("Java Arrays:-");
        System.out.println();

        // instantiate the ArrayConcepts class
        ArrayConcepts ac = new ArrayConcepts();

        // firstArray method invocation
        System.out.println("getProgrammingLangs method output ...........");
        String [] langs = ac.getProgrammingLangs();
        System.out.println(Arrays.toString(langs)); // to print array
        System.out.println();

        // initializeArrayInOneGo method call
        System.out.println("initializedArrayInOneGo method output ...........");
        double[] numbs = ac.initializeArrayInOneGo();
        System.out.println(Arrays.toString(numbs));

        // useForEachLoop
        System.out.println();
        System.out.println("useForEachLoop method output ..........");
        ac.useForEachLoop();
    }
}
