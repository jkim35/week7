import java.util.*;
public class numbersum {
    public static void main(String[]args){
        int number;
        int printNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Insert number: ");
        number = input.nextInt();
        printNumber = 1;
        while (printNumber <= number){
            System.out.println(printNumber);
            printNumber++;
        }
    }
}
