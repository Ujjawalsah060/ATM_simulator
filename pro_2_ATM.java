import java.util.Scanner;

public class pro_2_ATM {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        int choice;
        double amount;

        do {
            System.out.println("\n==========================");
            System.out.println("      ATM SIMULATOR");
            System.out.println("==========================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    CheckBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    amount = sc.nextDouble();
                    balance = deposite(balance, amount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    amount = sc.nextDouble();
                    balance = withdraw(balance, amount);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }


    

    // function of check balance
    static void CheckBalance( double balance){
        System.out.println("Your current Balance is:" + balance);

    }

    // function to deposite money
    static double  deposite(double balance, double amount){
        balance = balance+ amount;
        System.out.println(" Rs" + amount +" Succesfully deposited");
        return balance;
    }

     // function to withdraw money:
      static double withdraw( double balance, double amount){
        if (amount<=balance){
            balance= balance-amount;
            System.out.println("Rs"+ amount+"Withdraw successfully");
        }else{
            System.out.println("Insufficient Balance");
        }
        return balance;
      }


    
}
