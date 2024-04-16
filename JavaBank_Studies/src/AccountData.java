import java.util.Scanner;

public class AccountData {
    public static void main(String[] args) {
        /*  1- Check Balance
            2- Receive Value
            3- Value Transfer
            4-Exit
         */
        int operations = 0;
        Scanner readingDatas = new Scanner(System.in);

        System.out.println("Insert your balance: ");
        double balance = readingDatas.nextDouble();

        System.out.println("Operations:");
        String menu = """
                1- Check Balance
                2- Value Transfer
                3- Receive Value
                4- Exit
                """;

        while(operations != 4){
            System.out.println(menu);
            operations = readingDatas.nextInt();

            if(operations == 1){
                System.out.println("Current balance: " + balance);
            } else if (operations == 2) {
                System.out.println("Insert the transfer value: ");
                double transferValue = readingDatas.nextDouble();
                System.out.println("Transferred value: " + transferValue);
                if(transferValue > balance){
                    System.out.println("You can't make this transfer.");
                }else{
                    balance -= transferValue;
                    System.out.println("Transfer success!");
                }
            } else if (operations == 3) {
                System.out.println("Insert the receive value: ");
                double receiveValue = readingDatas.nextDouble();
                balance += receiveValue;
                System.out.println("Receive sucess!");
            } else if (operations != 4) {
                System.out.println("This operation is unavailable.");
            }
        }
    }
}
