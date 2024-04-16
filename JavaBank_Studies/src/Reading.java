import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Name: ");
        String userName = reading.nextLine();

        System.out.println("E-mail: ");
        String userEmail = reading.nextLine();

        System.out.println("Current balance: ");
        double currentBalance = reading.nextDouble();

        if(currentBalance >= 1000){
            System.out.println("Account type: (for example: current or savings)");
            String accountType = reading.nextLine();
            System.out.println("Account type: " + accountType);
        }
        else{
            System.out.println("Your balance isn't enough to open a savings account.");
        }
        System.out.println("Name: " + userName);
        System.out.println("E-mail: " + userEmail);
        System.out.println("Current balance: " + currentBalance);

    }
}
