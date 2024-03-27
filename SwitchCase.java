  /*
     * How Switch case works:
     *  switch(month) -> month is a variable that is compared with each case value, for ex 1 in case 1
     *  The block of the case that matches month value will be executed
     *  If no case matches the month value, the block of the defualt case will be executed
     */
    
public class SwitchCase {
    public static void main(String[]args){
        System.out.println("This is a Switch Case conditon implementation.");
        
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
