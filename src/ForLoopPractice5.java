import java.util.Scanner;

public class ForLoopPractice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int total = 1;
        for(int i = 1; i<=num; i++){
            total = total * i;
        }
        System.out.println("factorial of " + num + "is :" +total);
    }
}
