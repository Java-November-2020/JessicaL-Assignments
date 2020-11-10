import java.util.Random;

public class BankAccount {
    protected String accountNumber;
    protected Double checkingBalance;
    protected Double savingsBalance;
    protected static int numberOfAccounts;
    protected static long amountInAccounts;


    public BankAccount(){
        this.accountNumber = BankAccount.randomAcctNumber();
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
    }

        //setters

    // }
    // public void setCheckingBal(){
    //     this.checkingBalance = checkingBalance;
    // }
    // public void setSavingsBal(){
    //     this.savingsBalance = savingsBalance;
    // }
    // public static void setNumOfAccts(){
    //     this.numberOfAccounts = numberOfAccounts;
    // }
    // public static void setAmtInAccts(){
    //     this.amountInAccounts = amountInAccounts;
    // }


        //getters
    public String getAccountNum(){
        return this.accountNumber;
    }
    public Double getCheckingBal(){
        return this.checkingBalance;
    }
    public Double getSavingsBal(){
        return this.savingsBalance;
    }
    public static int getNumOfAccts(){
        return numberOfAccounts;
    }
    public static long getamtAccts(){
        return amountInAccounts;
    }

    public void makeDeposit(double deposit, String acctType){
        if(acctType.equals("Checking")){
            this.checkingBalance += deposit;
            this.amountInAccounts += deposit;
            System.out.println("New Checking Balance: " + getCheckingBal());
        }else if(acctType.equals("Savings")){
            this.savingsBalance += deposit;
            this.amountInAccounts += deposit;
            System.out.println("New Savings Balance: " + getSavingsBal());
        }
    }
    public void makeWithdrawal(double withdAmt, String acctType){
        if(acctType.equals("Checking")){
            if(getCheckingBal() > withdAmt){
                this.checkingBalance -= withdAmt;
                this.amountInAccounts -= withdAmt;
                System.out.println("After withdrawing " + withdAmt + ", new Checking Balance: " + getCheckingBal());
            }
            System.out.println("Not enough funds for Checking withdrawal");

        }else if(acctType.equals("Savings")){
            if(getSavingsBal() > withdAmt){
                this.savingsBalance -= withdAmt;
                this.amountInAccounts -= withdAmt;
                System.out.println("New Savings Balance: " + getSavingsBal());
            }
            System.out.println("Not enough funds for Savings withdrawal");

        }
    }
    public static String randomAcctNumber(){
        String newAcct = "";
        Random r = new Random();
        for(int i = 0; i<10; i++){
            newAcct += r.nextInt(10);
        }
        numberOfAccounts ++;
        return newAcct;
    }

    public void totalDeposits(){
        System.out.println(("You have: " + numberOfAccounts + " accounts"));
        System.out.println("Checking Balance: " + checkingBalance);
        System.out.println("Savings Balance: " + savingsBalance);
        System.out.println("Total Balances: " + amountInAccounts);
    }















    //     //return random 10 digit account number
    // private static String createRandomAccount(){
    //     int start = 1000000000;
    //     long end = 9999999999L;
    //     Random rAcct = new Random();
    //     for(int i = 1; i <=3000; i++){
    //         randomInt(start, end, rAcct);
    //     }
    //         return null;
    // }

    // private static void randomInt(int aStart, long aEnd, Random aRandom){
    //     if ( aStart > aEnd ) {
    //       System.err.println("Start cannot exceed End.");
    //     }
    //     //get the range, casting to long to avoid overflow problems
    //     long range = (long)aEnd - (long)aStart + 1;
    //     // logger.info("range>>>>>>>>>>>"+range);
    //     // compute a fraction of the range, 0 <= frac < range
    //     long fraction = (long)(range * aRandom.nextDouble());
    //     // logger.info("fraction>>>>>>>>>>>>>>>>>>>>"+fraction);
    //     int randomNumber =  (int)(fraction + aStart);    
    //     // logger.info("Generated : " + randomNumber);
    //     System.out.println(randomNumber);
    //   }



}
