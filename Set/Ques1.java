/* Question 1:
    Create a program to store unique stock symbols in a HashSet. 
    Ensure that no duplicates are allowed. 
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques1 {
    public static void main(String[] args) {
        //Creating a HashSet to store Stock Symbols
        Set <String> stockSymbols = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        //Taking input for Stock Symbols
        for(int i=0; i<=3; i++){
            System.out.println("Enter Stock Symbols- " + i + " :");
            String addSymbol = sc.nextLine();

            //Checking for duplicate entry
            if(!stockSymbols.contains(addSymbol)){
                stockSymbols.add(addSymbol);
            }else{
                System.out.println("Duplicate Entry!");
                i--;
            }
        }

        //Display the Stock Symbols
        System.out.println("Stock Symbols:: ");
        for(String sym : stockSymbols){
            System.out.println(sym);
        }
        sc.close();
        
    }
}
