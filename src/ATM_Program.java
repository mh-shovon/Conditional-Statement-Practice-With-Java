import java.util.Scanner;

public class ATM_Program {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;

        Scanner input = new Scanner(System.in);

        //while(true)
        //{
            System.out.println("Automated Teller Machine ===>");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = input.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("New Balance is : " + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");
                    deposit = input.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("New balance is : " + balance);
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        //}
    }
}

//if we use the commented lines then it shows the option aain after execution

