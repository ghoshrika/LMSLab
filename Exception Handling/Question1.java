/* Question 1:
    Scenario: You are working on a financial application, and you need to handle a situation 
    where a user enters an invalid amount for a transaction. Create a custom exception called 
    "InvalidAmountException" and demonstrate how to use it to handle this scenario. 
*/

//Custom exception class for handling invalid transaction
class InvalidAmountException extends Exception{
    InvalidAmountException(){
    }

    InvalidAmountException(String msg){
        super(msg);
    }
}

//Class for validating transaction amount
class TransactionValidator{
    //Method to check validation of transaction amount
    public String validate(Integer amount) throws InvalidAmountException{
        if(amount <= 0){
            //throw exception when transaction amount is invalid
            throw new InvalidAmountException("You entered amount is invalid.");
        }
        else{
            return "You entered right amount.";
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        TransactionValidator validator = new TransactionValidator();
        try{
            System.out.println(validator.validate(0));
        }
        //handle the exception and show error message
        catch(InvalidAmountException i){
            System.out.println(i);
        }
    }
}
