import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args){
        // this is a console Project for making the Simple calculator to clear the concept of datatype

        //variable decleration
        Double num1;
        Double num2;
        Scanner scanner= new Scanner(System.in);

        //display the menu
        System.out.println("********************");
        System.out.println("* 1. Add           *");
        System.out.println("* 2. Sub           *");
        System.out.println("* 3. Mul           *");
        System.out.println("* 4. Div           *");
        System.out.println("* 5. Mod           *");
        System.out.println("********************");
        System.out.print("Select the choice :- ");
        int Choice = scanner.nextInt();

        //logic
        switch(Choice){
            case 1:
                System.out.println("You have selected addition ");
                System.out.print("Enter Frist Number :- ");
                num1 = scanner.nextDouble();
                System.out.print("Enter Second  Number :- ");
                num2 = scanner.nextDouble();
                System.out.println("Answer is :- "+(num1+num2));
                System.out.println("Thank You");
                break;
            case 2:
                System.out.println("You have selected Subtraction ");
                System.out.print("Enter Frist Number :- ");
                num1 = scanner.nextDouble();
                System.out.print("Enter Second  Number :- ");
                num2 = scanner.nextDouble();
                System.out.println("Answer is :- "+(num1-num2));
                System.out.println("Thank You");
                break;
            case 3:
                System.out.println("You have selected Multiplication ");
                System.out.print("Enter Frist Number :- ");
                num1 = scanner.nextDouble();
                System.out.print("Enter Second  Number :- ");
                num2 = scanner.nextDouble();
                System.out.println("Answer is :- "+(num1*num2));
                System.out.println("Thank You");
                break;
            case 4:
                System.out.println("You have selected Division ");
                System.out.print("Enter Frist Number :- ");
                num1 = scanner.nextDouble();
                System.out.print("Enter Second  Number :- ");
                num2 = scanner.nextDouble();
                System.out.println("Answer is :- "+(num1/num2));
                System.out.println("Thank You");
                break;
            case 5:
                System.out.println("You have selected Modulo ");
                System.out.print("Enter Frist Number :- ");
                num1 = scanner.nextDouble();
                System.out.print("Enter Second  Number :- ");
                num2 = scanner.nextDouble();
                System.out.println("Answer is :- "+(num1%num2));
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Entred option is not from the menu Please select Valid  option ");
        }
    }
}
