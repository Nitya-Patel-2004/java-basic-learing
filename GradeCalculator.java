import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args)
    {
        //variables and Object
        Scanner scanner= new Scanner(System.in);
        Double[] marks= new Double[5];
        Double Total =0.0;
        Double percentage=0.0;

        //input
        for(int i=0 ;i<5;i++)
        {
            System.out.print("Enter Marks for "+(i+1)+" Subject :- ");
            marks[i]=scanner.nextDouble();
        }

        //output
        for(int i=0 ;i<5;i++)
        {
            System.out.println("Marks for "+(i+1)+"Subject :- "+ marks[i]);
            Total+=marks[i];
        }

        System.out.println("Total Marks Obtain ;- "+ Total);
        System.out.println("Percentage Obtain :-  "+ ((Total*100)/500));

        if(percentage>90.00){
            System.out.println("Grade Obtain :- A");
        } else if (percentage<=90.00 || percentage>=60.00) {
            System.out.println("Grade obtain :- B");
        } else {
            System.out.println("Fail :(");
        }
    }
}
