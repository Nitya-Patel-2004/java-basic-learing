import java.util.Scanner;

public class MenuDrivenBankAppplication
{
    public static void main(String[] args){

        //Variable
        float balance = 10000;
        float amouts;
        Scanner scanner=new Scanner(System.in);
        int userChoice;
        int flag=1;

        while(flag==1)
        {
        //Display Menu
        System.out.println("*************************");
        System.out.println("* 1. Deposit            *");
        System.out.println("* 2. Withdraw           *");
        System.out.println("* 3. Check Balance      *");
        System.out.println("* 4. Exit               *");
        System.out.println("*************************");
        System.out.print("Enter Your choice :- ");
        userChoice = scanner.nextInt();

        switch(userChoice)
        {
            case 1:
                System.out.print("Hello User Enter A Amount You Want To Deposit :-");
                amouts = (float) (scanner.nextDouble());
                 // adding amount to balance
                    balance += amouts;
                System.out.println("Your Amount is Deposited Successfully");
                System.out.print("Your Balance is : : "+balance);
                System.out.println("\n Thank You !!!");
                break;
            case 2:
                System.out.print("Hello User Enter A Amount You Want Withdraw :-");
                amouts = (float) (scanner.nextDouble());
                // subtracting amount to balance
                balance -= amouts;
                System.out.println("Your Amount is Withdraw Successfully");
                System.out.print("Your Balance is : : "+balance);
                System.out.println("\nThank You !!!");
                break;
            case 3:
                System.out.println("Hello User ");
                System.out.print("Your Balance is : : "+balance);
                System.out.println("\n Thank You !!!");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid Choice must select bettween 1-4");
        }
        }
    }
}
