import java.util.Scanner;

public class LatgestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter secon number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("First Number is the largest number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Second Number is the largest number");
        }
        else{
            System.out.println("Third Number is the largest number");
        }
    }
}
