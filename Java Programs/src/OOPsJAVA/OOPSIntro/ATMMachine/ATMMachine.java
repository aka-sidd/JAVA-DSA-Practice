package OOPsJAVA.OOPSIntro.ATMMachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5679;
    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        while(attempts>0){
        System.out.println("Enter Your PIN: ");
        int EnteredPin = sc.nextInt();
        if(EnteredPin == PIN){
            menu();
            break;
        }
        else{
            attempts--;
            System.out.println("Invalid Pin! " + attempts + " Attempts remaining");
        }

        }
        if(attempts==0){
            System.out.println("Card Blocked! Too many Wrong attempts");
        }
    }
    public void menu(){
        System.out.println("Enter Your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            CheckBalance();
        }
        else if(opt==2){
            WithDrawMoney();
        }
        else if(opt==3){
            DepositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a Valid Choice");
        }

    }
    public void CheckBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void WithDrawMoney(){
        System.out.println("Enter Amount to WithDraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Funds");
        }
        else{
            Balance-=amount;
            System.out.println("Money WithDraw Successful");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance+=amount;
        System.out.println("Money Deposited Successfully!!");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
