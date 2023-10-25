/* Question 7:
    Implement a function to capitalize the first letter of each word in a sentence.
*/

import java.util.Scanner;

public class CapitalizeLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for sentence
        System.out.println("Enter a Sentence:: ");
        String sentence = sc.nextLine();
        
        //split words
        String[] word = sentence.split(" ");

        for(int j=0; j<word.length; j++){
            //divide sentence in two part
            String firstCharacter = word[j].substring(0, 1);
            String remainingCharacters = word[j].substring(1);

            //convert first character to capital
            firstCharacter = firstCharacter.toUpperCase();
            word[j] = firstCharacter + remainingCharacters;
        }

        String finalSentence = String.join(" ", word);
        System.out.println("After capitalized first leeter of each word:: " +finalSentence);
        sc.close();
    }
}
