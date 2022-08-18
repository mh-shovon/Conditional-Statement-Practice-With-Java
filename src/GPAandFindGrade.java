import java.util.Scanner;

public class GPAandFindGrade {
    public static void main(String[] args) {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner input = new Scanner(System.in);


        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A+");
        }
        else if(avg>=70 && avg<79)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<69)
        {
            System.out.print("A-");
        }
        else if(avg>=50 && avg<59)
        {
            System.out.print("B");
        }
        else if(avg>=40 && avg<49)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("F");
        }
    }
}


