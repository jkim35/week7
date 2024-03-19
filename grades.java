import java.util.*;
public class grades{
    public static void main(String[]args){
        int gradeNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What did you get on the test today?");
        gradeNumber = input.nextInt();
        if(gradeNumber >= 90){
            System.out.println("An A? Thats good!");
        }
        else if (gradeNumber >= 80){
            System.out.println("A B? Not bad!");
        }
        else if (gradeNumber >= 70){
            System.out.println("A C? Thats alright.");
        }
        else if (gradeNumber >= 65){
            System.out.println("A D? I think you should've studied more.");
        }else{
            System.out.println("You failed. Thats it, goodbye. I'm not your friend anymore.");
        }
    }
}