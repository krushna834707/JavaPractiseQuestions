package Encapsulation.SecondChallenge;

class Transaction{
   private String accountNumber;
   private String accountHolderName;
   private double balance;

   public Transaction(String accountNumber, String accountHolderName) {
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
   }

   public void depositMoney(double money){
      if(money<=0){
         System.out.println("Invalid Money");
      }else {
         System.out.println("Deposited Money is : "+money);
         balance+=money;

      }
   }


   public double withdrawMoney(double money){
      if(money<=0){
         System.out.println("No money in the account");
      }else if(money<balance){
         balance-=money;
         System.out.println("Balance is : "+balance);
      }else{
         money=balance;
         balance =0;
      }
      return money;
   }
}
public class BankAccount {
   public static void main(String[] args) {
      Transaction t1 = new Transaction("1001","krushna");

      t1.depositMoney(100);

      t1.withdrawMoney(5);
   }
}
