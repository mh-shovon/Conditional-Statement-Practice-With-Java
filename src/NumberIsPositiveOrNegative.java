import java.util.Scanner;

public class NumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Given number is Positive.");
        }
        else{
            System.out.println("Given number is Negative");
        }
    }
}
