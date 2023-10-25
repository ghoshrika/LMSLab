/* Question 4:
    Write a function to remove all vowels from a string. 
*/

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for String
        System.out.println("Enter a sentence: ");
        String string = sc.nextLine();

        //Checking for vowel in the String
        System.out.println("New Sentence after removing all vowel:: ");
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' || 
            string.charAt(i)=='O' || string.charAt(i)=='U' || string.charAt(i)=='a' || 
            string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || 
            string.charAt(i)=='u')
            {
                continue;
            }
            else{
                System.out.print(string.charAt(i));
            }
        } 
        sc.close();
    }
}
