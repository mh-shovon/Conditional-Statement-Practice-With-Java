public class ReverseNumber {
    public static void main(String[] args) {
        int number=543, reverse=0;
        while(number!=0){
            int rem=number%10;
            number=number/10;
            reverse=reverse*10+rem;
        }
        System.out.println(reverse);
    }
}
