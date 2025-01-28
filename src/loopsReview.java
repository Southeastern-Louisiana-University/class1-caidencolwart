package src;
import java.util.Scanner;

//homework calculate average and display to user. Then provide a letter grade based on ten point scale.

public class loopsReview {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;

        while (grade >= 0) {
            System.out.print("Please enter the grade ranging from 0-100 (-1 to terminate): ");
            grade = input.nextDouble();

            if(grade > 110){
                System.out.println("Invalid number!");
            } else{
                sum += grade;
                count++;
            }
            System.out.println("The count is: " + count + "The sum is: " + sum);
        }
        System.out.println("Thanks for using my program");
    }
}
