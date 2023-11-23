/* Question 4:
    Scenario: You need to divide two numbers in your code, and you want to handle the scenario 
    where the denominator is zero. Write a code snippet to handle this case. 
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int x,y;
        double z;
        Scanner sc = new Scanner(System.in);

        //Taking user input for the numerator and denominator
        System.out.println("Enter the Numerator to make division: ");
        x = sc.nextInt();

        System.out.println("Enter the Denominator to make division: ");
        y = sc.nextInt();

        try{
            //Attempt to perform the division
            z = x/y;
            System.out.println("Result: " + z);
        }
        //if any exception occur catch and handle the exception 
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("Division attempt successfully.");
        }
        sc.close();
    }
}
