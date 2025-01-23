package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class reviewPart1{
    public static void main(String[] args){
        double score = 0;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Please enter the students grade (0-100): ");
            score = scanner.nextDouble();

            if(score >= 90){
                System.out.println("Your grade is an A \nExcellent work!");
            }
            else if (score >= 80) {
                System.out.println("Your grade is a B \nGood job!");
            }
            else if (score >= 70) {
                System.out.println("Your grade is a C \nNice.");
            }
            else if (score >= 60) {
                System.out.println("Your grade is a D \nYou can do better!!!");
            }
            else if (score < 60 && score >= 0){
                System.out.println("Your grade is a F \nTerrible");
            } else {
                System.out.println("Make sure the input is greater than or equal to 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numerical value");
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
}