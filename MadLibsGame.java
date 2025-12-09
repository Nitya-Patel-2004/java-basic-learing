import  java.util.Scanner;

public class MadLibsGame {

    public static void main(String args[]) {
        // variables
        String adjective;
        String bugType;
        String className;
        String methodName;
        String number;
        String tool;
        String seniorName;
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Enter an Adjective (a word that modifies or describes a noun or pronoun) :");
        adjective = scanner.nextLine();
        System.out.print("Enter an bugType :");
        bugType = scanner.nextLine();
        System.out.print("Enter a className :");
        className = scanner.nextLine();
        System.out.print("Enter a methodName :");
        methodName = scanner.nextLine();
        System.out.print("Enter a bug or reference Number  :");
        number  = scanner.nextLine();
        System.out.print("Enter a Tool :");
        tool = scanner.nextLine();
        System.out.print("Enter a senior name  :");
        seniorName = scanner.nextLine();

        //logic :-  Addding the variable values in the output statement.

        //output
        System.out.print("During a(n) "+adjective+" , our system encountered a "+bugType+" inside the "+className+" class.\n" +
                "The issue exploded when the "+methodName+"() method processed "+number+" unexpected requests.\n" +
                "Our team used "+tool+" to trace the bug, but nothing worked until "+seniorName+" walked in and said:\n" +
                "“Did you try turning it off and on again?”");
        scanner.close();
    }
}
