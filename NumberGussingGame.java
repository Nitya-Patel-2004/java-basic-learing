import java.util.Scanner;
import java.util.Random;

public class NumberGussingGame {
    public static void main(String[] args){

        //Variable
        int secret_num;
        int user_guess;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        secret_num = random.nextInt(0,10);
        System.out.println(secret_num);
        //input
        for(int i=0;i<=100;i++)
        {
            System.out.print("input your guess 0 between "+(secret_num+10)+":- ");
            user_guess = scanner.nextInt();

        //OUTPUT
        if(secret_num>=user_guess) {
            System.out.println("To Lower Go Higher In Gussing");
        }
        if (secret_num == user_guess) {
            System.out.println("You Hit The Target , Correst Gussing");
            break;
        }
        else {
            System.out.println("To Much High Go Lower In Gussing");
        }}
        scanner.close();
    }
}
