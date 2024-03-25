import java.util.*;
public class digit_sum {
    public static void main(String[]args){
        int orig;
        int newint;
        int remain;
        int remenants;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        orig = input.nextInt();
        remain = orig;
        newint = orig;
        if(remain <= 9){
            System.out.println(remain);
        }
        while(!(remain<=9)){
            newint += remain%10;
            remenants = remain%10;
             remain -= remenants;
            System.out.println(newint);
            System.out.println(remain);
        }
    }
}
