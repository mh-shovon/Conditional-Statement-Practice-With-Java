import java.util.Scanner;

public class SameOrDifferentUpToTwoDecimalPlaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number-1: ");
        double num1 = input.nextDouble();
        System.out.println("Enter Number-2: ");
        double num2 = input.nextDouble();
        if(Math.abs(num1-num2)<=0.001){
            System.out.println("These numbers are same.");
        }
        else {
            System.out.println("These numbers are not same");
        }
    }
}
