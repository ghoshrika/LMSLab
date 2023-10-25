/* Question 3:
    Implement a method to count the number of words in a given sentence.
*/

import java.util.Scanner;

public class WordCount {

    public static int wordCount(String str){
        //Checking for empty String
        if(str.isEmpty() || str == null){
            return 0;
        }
        else{
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for String
        System.out.println("Enter Any Sentence: ");
        String str = sc.nextLine();
        //Calling wordCount method
        int totalWord = wordCount(str);
        System.out.println("Total numbers of word in the sentence:: " + totalWord);
        sc.close();
    }
}
