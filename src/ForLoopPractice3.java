public class ForLoopPractice3 {
    public static void main(String[] args) {
        int i,sum = 0;
        for( i = 1; i <= 100; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum is = " + sum);
    }
}
