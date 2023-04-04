import java.util.Scanner;

public class Main 
{
    public static String show_menu()
    {
         String ch;
         System.out.print("Enter choice: \nA to show balance \nB to show previous transaction \nC to deposit \nD to withdraw \nE to show details \nF to exit: ");
         Scanner scanner2 = new Scanner(System.in);
         ch = scanner2.nextLine();
         System.out.println();
         return ch;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CREATE A BANK ACCOOUNT:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(" ");
        
        Bankaccount a = new Bankaccount(name , password);

        String choice = show_menu();

        while (!choice.equals("F"))
        {
            if (choice.equals("A"))
            {
                System.out.println("Balance: " + a.getBalance());
                System.out.println(" ");
            }
            if (choice.equals("B"))
            {
                System.out.println("Previous Transaction: " + a.getPrevTransaction());
                System.out.println(" ");
            }
            if (choice.equals("C"))
            {
                System.out.println("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(" ");
                System.out.print("Enter your password: ");
                String acctpassword = scanner.nextLine();
                System.out.println(" ");
                a.deposit(acctpassword, amount);
            }
            if (choice.equals("D"))
            {
                System.out.println("Enter amount to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" ");
                System.out.print("Enter your password: ");
                String acctpassword = scanner.nextLine();
                System.out.println(" ");
                a.withdraw(acctpassword, amount);
            }
            if (choice.equals("E"))
            {
                a.getDetails();
            }
            choice = show_menu();
        }
        scanner.close();
        System.out.println("THANK YOU FOR USING MYBANK:)");
        System.out.println(" ");
    }
}
