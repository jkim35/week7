import java.util.*;
public class gcd {
    public static void main(String[]args){
        int num1;
        int num2;
        int term;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter another number: ");
        num2 = input.nextInt();
        while(num2>0){
            term = num1 % num2;
            num1 = num2;
            num2 = term;
        }
        System.out.println("The GCF of the two numbers is "+num1);

    }
}
