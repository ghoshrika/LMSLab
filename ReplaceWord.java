/* Question 6:
    Create a function to replace all occurrences of a specific word in a sentence 
    with another word.
*/

import java.util.Scanner;

public class ReplaceWord {

    //Function to replace all word
    public static String replaceAllWord(String str, String originalWord, String newWord){
        if(str.isEmpty() || str == null){
            return "Empty String";
        }
        String output = str.replaceAll(originalWord, newWord);
        return output;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input for String
        System.out.println("Enter a Sentence:: ");
        String str = sc.nextLine();

        //Taking input for originalWord and newWord
        System.out.println("Enter the original word to replace: ");
        String originalWord = sc.nextLine();

        System.out.println("Enter the new word to replace: ");
        String newWord = sc.nextLine();

        //call function
        String finalOutput = replaceAllWord(str, originalWord, newWord);
        System.out.println("New Sentence:: " + finalOutput);
        sc.close();
    }
}
