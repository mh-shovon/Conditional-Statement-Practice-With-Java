import java.util.Scanner;

public class ForLoopPractice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,flag=0;
        int n = input.nextInt();
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }


        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return  false;
        }
        return true;*/
    }
}
