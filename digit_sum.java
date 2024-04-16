import java.util.*;
public class digit_sum {
    public static void main(String[]args){ 
        int digit;
        int num;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        num = input.nextInt();
        sum = 0;
        do{
            digit = num%10;
            num = num/10;
            sum += digit;
        }while(num != 0);
        System.out.println("Your digit sum is "+sum);
    }
}
