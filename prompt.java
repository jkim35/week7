import java.util.*;
public class prompt {
    public static void main(String[]args){
        int min;
        int max;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a minimum value: ");
        min = input.nextInt();
        System.out.print("Enter a maximum value: ");
        max = input.nextInt();
        do{
            System.out.print("Enter a number between the range: ");
            number = input.nextInt();
        }
        while(number <= min || number >= max);
        System.out.println("The minimum value is "+min);
        System.out.println("The number you chose is "+number);
        System.out.println("The maximum value is "+max);
    }
}
