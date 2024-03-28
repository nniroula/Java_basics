/*
 * Enumeration type (enum) is used to declare variables of same kind at once
 * 
 * enum variable starts wiht capital letter
 */

import java.util.Scanner;

public class Enum {
    public enum Grades {A, B, C, D, F};
    public static void main(String []args){
        // enum Grd {A, B, C, D, F}; // this also works
        System.out.print("Enter your score: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        if(numb >= 90 && numb <= 100){
            Grades letterGradeA = Grades.A;  // enum usage
            System.out.printf("Your letter grade is %s", letterGradeA);
        }else if(numb >= 80 && numb < 90){
            Grades letterGradeB = Grades.B;
            System.out.printf("Your letter grade is %s", letterGradeB);
        }else if(numb >= 70 && numb < 80){
            System.out.printf("Your letter grade is %s", Grades.C);
        }else if(numb >= 60 && numb < 70){
            System.out.printf("Your letter grade is %s", Grades.D);
        }else{
            System.out.printf("Your letter grade is %s", Grades.F);
        }
        System.out.println();
    }
}
