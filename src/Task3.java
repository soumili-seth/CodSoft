import java.util.Scanner;


class ATM{

        private userAccount acc;
        private int pin;

public ATM(userAccount ac,int pin) {

    this.acc = ac;
    this.pin = pin;
}

    public void menu(){

        System.out.println("enter your choice" ); 
        System.out.println("1. Chech A/C Balance:" ); 
        System.out.println("2. Deposit money:" ); 
        System.out.println("3. Withdraw Money:" ); 
        System.out.println("4. EXIT" ); 
        
    }

    public boolean checkpin(int entered_pin){
        return this.pin == entered_pin;
    }
     
    public void bank_process(){
        Scanner sc = new Scanner(System.in);
        int entered_pin;
        System.out.println("Enter your pin:" ); 
        entered_pin = sc.nextInt();

        if(checkpin(entered_pin)){
            int opt=0;
            while(opt != 4){
                menu();
                System.out.println("Enter your choice:" ); 
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Account Balance is : " + acc.checkBalance()); 
                        break;

                    case 2:
                        System.out.println("Enter the amount to deposit : "); 
                        double amount= sc.nextDouble();
                        acc.depositBalance(amount);
                        break;
                    
                    case 3:
                        System.out.println("Enter the amount to withdraw :"); 
                        double amt= sc.nextDouble();
                        acc.withdrawBalance(amt);
                        break;

                    default:
                    System.out.println("Enter a valid choice:"); 
                }
            }

        }

        else{
            System.out.println("Incorrect Pin"); 
        }

        sc.close();
    }

}

class userAccount {

    private double bal;

    public userAccount(double initial_bal){
        this.bal = initial_bal;
    }

    public double checkBalance(){
        return bal;
    }
 
    public void depositBalance(double amount){
        if(amount > 0){
            bal = bal+amount;
            System.out.println("The Amount" + amount + "is deposited successfully"); 
        }
        else {
            System.out.println("You cannott deposit a amount less than 0."); 
        }
    }

    public void withdrawBalance(double amt){
        if(amt > 0 && amt <= bal){
            bal = bal - amt;
            System.out.println("The Amount" + amt + "is withdrawn successfully"); 
        }
        else{
            System.out.println("Insufficient Balance"); 
        }
    }

}


public class Task3{

    public static void main(String[] args) {
        userAccount user_account = new userAccount(0) ;
        int actual_pin = 2546;
        ATM atm = new ATM(user_account, actual_pin);
        atm.bank_process();

    }
}

    