public class Bankaccount 
{
    private String password;
    private double balance;
    private String prev_transactions;
    private String name;
    public static final double penalty = 50;

    public Bankaccount()
    {
        password = null;
        balance= 0;
        name = null;
        prev_transactions = null;
    }

    public Bankaccount(String acctname, String acctpassword)
    {
        name = acctname;
        password = acctpassword;
        balance = 0;
        prev_transactions = null;
    }

    public  double getBalance()
    {
        return this.balance;
    }

    public void deposit(String acctpassword, double amount)
    {
        if (acctpassword.equals(password))
        {
            balance+=amount;
            System.out.println("Deposited: "+ amount + "\nBalance: " + balance);
            prev_transactions = ("Deposited: " + amount);
            System.out.println(" ");
        }
        else
        {
            System.out.println("Wrong password");
            System.out.println(" ");
        }
    }

    public void withdraw(String acctpassword, double amount)
    {
        if (acctpassword.equals(password))
        {
            if (balance<amount)
            {
                balance = balance-(amount+penalty);
                System.out.println("Withdrawn: " + amount + "\n Penalty: " + penalty + "\n Balance: " + balance);
                prev_transactions = ("Withdrawn: " + amount + "   penalty taken");
                System.out.println(" ");
            }
            else
            {
                balance-=amount;
                System.out.println("Withdrawn: " + amount + "\n Balance: " + balance);
                prev_transactions = ("Withdraen" + amount);
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("Wrong Password");
            System.out.println(" ");
        }
    }

    public String getPrevTransaction()
    {
        return prev_transactions;
    }

    public void getDetails()
    {
        System.out.println("Name: " + name + "\n Password: " + password + "\n Balance: " + balance);
        System.out.println(" ");
    }

}