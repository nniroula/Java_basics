public class WhileLoop {
    public static void main(String []args){
        int score = 80;
        int benchmark = 20;
        boolean done = false;
        int count = 1;
        while(!done){
            score -= 20;
            System.out.printf("Score at %d is %d \n", count, score);
            if(score == benchmark){
                done = true;
            }
            count++;
        }
    }
}
