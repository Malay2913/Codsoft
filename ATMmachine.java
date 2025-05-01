import java.util.Scanner;
public class ATMmachine
{
    private static int balance = 1000;

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int pin = 2911;
                
        System.out.println("Welcome to the ATM machine!");
        System.out.print("Enter your PIN: ");
        int enteredPin = obj.nextInt();
                
            if (enteredPin == pin) 
            {
                System.out.println("PIN accepted. You can proceed.");

                while(true)
                {
                    System.out.println("\n1.Check balance");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Exit");
                    System.out.print("Select an option: ");
                    int op = obj.nextInt();

                    switch(op)
                    {
                        case 1: 
                            checkbalance();
                            break;

                        case 2:
                            System.out.println("\nplease enter 500, 200, 100 notes only");
                            System.out.print("Enter amount to deposit: ");
                            int depositamount = obj.nextInt();
                            if (depositamount % 100 != 0) 
                            {
                                System.out.println("Please collect the rejected notes.");
                            }  
                            else 
                            {
                                deposit(depositamount);
                            }
                                break;
                            
                        case 3: 
                            System.out.print("\nEnter amount to withdraw: ");
                            int withdrawamount = obj.nextInt();
                            if (withdrawamount > balance) 
                            {
                                System.out.println("Insufficient balance.");
                            } 
                            else 
                            {
                                withdraw(withdrawamount);
                            }
                            break;
                            
                        case 4:
                            System.out.println("\nExiting the ATM. Thank you for using our service.");
                            return; 

                        default:
                            System.out.println("\nInvalid option. Please try again.");
                            break;
                    }
                }
            } 
            else 
            {
                System.out.println("Incorrect PIN. Please try again.");
                return;
            }
    }

    public static void checkbalance() 
    {
        System.out.println("\nChecking balance...");
        System.out.println("Your balance is $1000.");
    } 
    
    public static void deposit(int amount)
    { 
        if (amount > 0 && (amount % 500 == 0 || amount % 200 == 0 || amount % 100 == 0)) 
        {
            balance += amount;
            System.out.println("\nDepositing " + amount + ".");
            System.out.println("Deposit successful.");
            System.out.println("Your new balance is: $" + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount. Please enter denominations of 500, 200, or 100 only.");
        }
    }

    public static void withdraw(int amount) 
    {
        if (amount > 0 && amount <= balance) 
            {
                balance -= amount;
                System.out.println("\nWithdrawing " + amount + ".");
                System.out.println("Withdraw successful");
                System.out.println("Your new balance is: $" + balance);
                System.out.println("Please collect your Cash");
            } 
        else 
            {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
    }
}
