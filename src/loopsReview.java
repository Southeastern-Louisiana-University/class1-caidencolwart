package src;
import java.util.Scanner;

//homework calculate average and display to user. Then provide a letter grade based on ten point scale.

public class loopsReview {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        //var
        double grade = 0;
        double sum = 0;
        double count = 0;
        double average = 0;

        //while grade is greater than or equal to zero take in user input for grade and calculate sum and average and count
        while (grade >= 0) {
            //user input
            System.out.print("Please enter the grade ranging from 0-100 (-1 to terminate): ");
            grade = input.nextDouble();
            //making sure grade isnt larger than 110
            if(grade > 110 || grade <= -1){
                System.out.println("INVALID! NOT WITHIN THE RANGE GIVEN");
            } else{
                sum += grade;
                count++;
                average = sum / count;
            }
            //display info
            System.out.println("The count is: " + count + "\nThe sum is: " + sum + " \nThe average is: " + average);
            System.out.println("Your letter grade is: " + getGrade(average));
        }
        System.out.println("\nThanks for using my program");
    }

    //get grade method returning type string
    public static String getGrade(double grade){
        if(grade >= 90){
            return "A";
        } else if (grade >= 80){
            return "B";
        } else if (grade >= 70){
            return "C";
        } else if (grade >= 60){
            return "D";
        } else {
            return "F";
        }
    }
}
