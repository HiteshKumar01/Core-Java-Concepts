package variables;

//types of variable: static, non-static and local variables
public class BankAccount {
    //static variable //stored in method area
    static String bankName="State Bank Of India";
    //non-static variables //stored in heap area
    String accountHolderName;
    String accountNumber;
    float balance;

    public static void main(String[] args){
        System.out.println(BankAccount.bankName);//calling the static variable
        //calling non-static variables
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountHolderName="Hitesh";
        bankAccount.accountNumber="576879008557";
        bankAccount.balance=30000;
        System.out.println(bankAccount.accountHolderName);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.balance);

        //local variable //store in stack memory area //should always be initialized //cannot use access modifiers in local variables
        double interestRate=7.5;
        System.out.println(interestRate);
    }
}
