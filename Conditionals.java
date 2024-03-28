/*
 * Three conditional statements in java are if statement, if-else statement, and switch statement
 * This program uses if and if-else statements
 */

import java.util.Scanner;

public class Conditionals {
    /* Grade calculator */

    // declare all variables of same kind once uisng enum
    public enum LetterGrade { A, B, C, D, F };
    public static void main(String []args){
        // get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100)
        {
            LetterGrade grade = LetterGrade.A;
            System.out.printf("Your letter grade is %s", grade);
            System.out.println();
        }
        else if(score >= 80 && score < 90)
        {
            LetterGrade grade = LetterGrade.B;
            System.out.printf("Your letter grade is %s", grade);
            System.out.println();
        }
        else if(score >= 70 && score < 80)
        {
            LetterGrade grade = LetterGrade.C;
            System.out.printf("Your letter grade is %s", grade);
            System.out.println();
        }else if(score >= 60 && score < 70){
            System.out.printf("Your letter grade is %s", LetterGrade.D);
            System.out.println();
        }else{
            System.out.printf("Your letter grade is %s", LetterGrade.F);
            System.out.println();
        }
        sc.close();
    }
}
