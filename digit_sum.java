import java.util.*;
public class digit_sum {
    public static void main(String[]args){
        int orig;
        int newint;
        int remain;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        orig = input.nextInt();
        remain = orig;
        newint = orig;
        while(!(newint<=9)){
            newint += remain%10;
            System.out.println(newint);
        }
    }
}
