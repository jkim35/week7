import java.util.*;
public class numbersum {
    public static void main(String[]args){
        int number;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number: ");
        number = input.nextInt();
        i = 1;
        while (i <= number){
            System.out.println(i);
            i++;
        }
    }
}
