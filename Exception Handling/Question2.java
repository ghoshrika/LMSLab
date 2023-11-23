/* Question 2:
    Scenario: When calculating interest on loans, you need to handle the scenario where the 
    interest rate is negative. Write a code snippet to handle this situation. 
*/

import java.util.Scanner;

//custom exception class to handle negative interest rate scenario
class NegativeInterestRateException extends Exception{
    NegativeInterestRateException(){
    }

    NegativeInterestRateException(String message){
        System.out.println(message);
    }
}

public class Question2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       try{
        //taking input for loan amount and rate of interest
        System.out.println("Enter loan amount ");
        double loanAmount = sc.nextDouble();

        System.out.println("Enter rate of interest: ");
        double interestRate = sc.nextDouble()/100;

        //Check if the interest rate is negative
        if(interestRate <= 0 ){
            throw new NegativeInterestRateException("Invalid interset rate: Interest rate should be positive.");
        }else{
            double interest = loanAmount * interestRate;
            System.out.println("Interest: " + interest);
        }
       }
       //handle exception
       catch(NegativeInterestRateException r){
        System.out.println(r);
       }
       finally{
        sc.close();
       }
    }
}
