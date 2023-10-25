/* Question 5:
    Develop a method to find the longest word in a sentence.
*/

import java.util.Scanner;

public class LongestWord {

    public static String findLongestWord(String sentence){
        //split sentence into word
        String[] words = sentence.split(" ");
        String longestWord = "";

        for(String word : words){
            //compare word length with longest word length
            if(word.length() > longestWord.length()){
                longestWord = word; //Replace longest word by the word
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for the String
        System.out.println("Enter any sentence: ");
        String sentence = sc.nextLine();

        //call findLongestWord method
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word is:: " + longestWord);
        sc.close();
    }
}
