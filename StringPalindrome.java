/* Question 2:
    Create a function to check if a given string is a palindrome.
*/

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str1){
        String revStr = "";
        boolean result = false;

        //reverse the string and store new string in revStr
        for(int i = str1.length()-1; i>=0; i--){
            revStr = revStr + str1.charAt(i);
        }

        //checking both string
        if(str1.equals(revStr)){
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for the string
        System.out.println("Enter a String:: ");
        String str1 = sc.nextLine();

        //call isPalindrome() function to check
        boolean result = isPalindrome(str1);
        System.out.println("Is Palindrome? " + result);
        sc.close();
    }
}
