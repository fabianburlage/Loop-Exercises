import java.util.Scanner;
import java.lang.Math;

public class Exercise13 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digit a number: ");

        int num = scanner.nextInt();
        int factorial = 1;


        for(int multiplier = 1; multiplier <= num; multiplier++){

            factorial = factorial * multiplier;


        }
        System.out.println("The factorial of " + num + " is: " + factorial);


    }


}
