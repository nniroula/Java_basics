/*
 * Ternary operator or Conditional Operatror is ?
 * Syntax is Conditon ? Expression 1 : Expression 2 
 *      => if the condition is true, Expression 1 is executed, if false, then Expression 2 is executed
 */

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String []args){
        System.out.println("Ternary Operator ...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
       // System.out.println(num % 2 == 0);
        String result = num % 2 == 0 ? " \"Even number\"  " : " 'Odd Number' ";
        System.out.println(result);
    }
}
