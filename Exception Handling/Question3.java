/* Question 3:
    Scenario: Your financial application requires a user to input their age, and you need to 
    ensure that it's a positive number. Describe how you would handle this scenario using a 
    custom exception. 
*/

import java.util.Scanner;

//Custome exception class to handle invalid age scenario
class AgeValidatorException extends Exception {
	AgeValidatorException() {
	}

	AgeValidatorException(String msg) {
		super("Error Message: " + msg);
	}
}

//AgeValidator class to perform the validation task
class AgeValidator {
	public String validate(Integer age) throws AgeValidatorException {
		if (age <= 0) {
            //Throw exception if the age is not positive number
			throw new AgeValidatorException("Invalid age: Age must be a positive number.");
		} else {
			return "You are eligible for application.";
		}
	}
}

public class Question3 {
    public static void main(String[] args) {
        AgeValidator ageValidator = new AgeValidator();
        Scanner sc = new Scanner(System.in);

		try {
            System.out.println("Enter your age: ");
            int userAge = sc.nextInt();
            //check validation for user's age 
			System.out.println(ageValidator.validate(userAge));
		}
        //handle exception if occur any
        catch (AgeValidatorException r) {
			System.out.println(r);
		}finally{
            sc.close();
        }
    }
}
