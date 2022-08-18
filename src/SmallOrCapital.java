import java.util.Scanner;

public class SmallOrCapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char Char = input.next().charAt(0);

        if (Char>=65 && Char<=95){
            System.out.println("Is a Capital Letter");
        }
        else if (Char>=97 && Char<=122) {
            System.out.println("Is a Small Letter");
        }
        else {
            System.out.println("Is not a Alphabet");
        }
    }
}
