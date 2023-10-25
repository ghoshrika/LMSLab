/* Question 1:
    Write a Java program to reverse a string using a loop.
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String new_str = "";
        for(int i=str.length()-1; i>=0; i--){
            new_str = new_str + str.charAt(i);
        }
        System.out.println("Reversed String is:: "+ new_str);
        sc.close();
    }
}
