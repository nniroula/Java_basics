/*
* Arrays in Java -> 1D, 2D
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays; // use Arrays.toString(arrName) to print array
import java.util.Scanner;

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

    /**
     * takes input file name from user, reads that input file and adds odd numbers to an array
     * @return elements count of partially filled array
     */
    public int getElementsCountOfPartiallyFilledArray(){
        int currentSize = 0;
        int [] odds = new int[5];

        // take user input in the form ot txt file
        Scanner console = new Scanner(System.in);
        File inFile;
        Scanner fileScanner;

        // get input file name from a user
        System.out.print("Enter your data file name: ");
        String inputFileName = console.next();
        System.out.println();
 
        try{
            inFile = new File(inputFileName); // file object
            fileScanner = new Scanner(inFile); // read the file

            while(fileScanner.hasNextInt()){
                if(currentSize < odds.length){
                    int inputNum = fileScanner.nextInt(); // get input from the file
                    if(inputNum % 2 != 0){ // add only odd numbers to the array
                        odds[currentSize] = inputNum;
                        currentSize++;
                    }
                }
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("Your file is not found");
        }
        finally{
           console.close();
        }

        return currentSize;
    }

    /**
     * calculates square of a given number and appends to an array
     * @return array of numbers
     */
    public int[] getNumSquares(){
        int evens [] = new int[6];
        for(int i = 1; i <= evens.length; i++){
            evens[i - 1] = i * i; // or Math.pow(i, 2);
        }
        return evens;
    }

    public int getMaxValue(int arr[]){
        int maxNumber = arr[0];

        for(int num: arr){
            if(num > maxNumber){
                maxNumber = num;
            }
        }
        return maxNumber;
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

        // getElementsCountOfPartiallyFilledArray
        System.out.println();
        System.out.println("getElementsCountOfPartiallyFilledArray method output ..........");
        int count = ac.getElementsCountOfPartiallyFilledArray();
        System.out.println("Current size of an array is " + count);

        //evenNumSquares
        int [] evens = ac.getNumSquares();
        System.out.println();
        System.out.println("evenNumSquares method output ............");
        System.out.println(Arrays.toString(evens));

        //getMaxValue
        System.out.println();
        System.out.println("getMaxValue method output ........");
        int [] intNUms = {2, 4, 3, 0, 36, 18};
        int maxValue = ac.getMaxValue(intNUms);
        System.out.println("Maximum value in given array is " + maxValue);
    }
}
