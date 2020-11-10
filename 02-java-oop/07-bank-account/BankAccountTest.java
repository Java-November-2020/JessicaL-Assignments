public class BankAccountTest {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();

        myAccount.makeDeposit(36.95, "Checking");
        myAccount.makeDeposit(25.00, "Savings");
        myAccount.totalDeposits();
        

        myAccount.makeWithdrawal(17.05, "Checking");
        myAccount.makeWithdrawal(10.33, "Savings");



    }
}
