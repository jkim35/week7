public class investment {
    public static void main(String[]args){
        double amount = 5000;
        int i = -1;
        do{
            amount = (amount *1.075);
            i++;
        }while(amount<=5000);
        System.out.println("It will take "+i+" years to reach 5,000 dollars.");
    }
}
