public class ForLoop {
    public static void main(String[]args){
        for(int i = 0; i< 10; i++){
            System.out.println(i);
        }
        System.out.println();

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        
        // forEach or Enhanced for loop
        System.out.println("forEach loop output is as follows: ");
        for(int num: arr){
            System.out.print("  " + num + " ");
        }
        System.out.println();
        System.out.println();
    
        // Nestd for loop
        System.out.println("Nested for loop output is:- ");
        for(int i = 1; i<= 3; i++){
            for(int j = 1; j<= 2; j++){
                System.out.print(" " + i*j);
            }
        }
        System.out.println();
    }
}
