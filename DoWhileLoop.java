/*
 * Do-While loop is used when there is a condition to run the loop at least one time before 
 * it is actually expected to generate some output
 */

public class DoWhileLoop {
    public static void main(String[]args){
        int count = 1;
        do // step 1
        {  // step 2
            System.out.println("Inside Do - While Loop"); // step 3
            System.out.println(count);
            count++; //step 4. updation
        }while(count < 10); //step 5 = Condition -> if true goes to step 2, false executes next statement

        System.out.println("Out side the Do-While Loop");
    }
}
