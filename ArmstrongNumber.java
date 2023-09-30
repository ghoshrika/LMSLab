/* 1. Write a program to find out all the Armstrong numbers within a given range 
using a method named printArmstrongNumber( int start, int end) 
by taking input from the user. The program should print the
Armstrong number in a given range starting from “start” and ending with “end”.
Note: Input should be taken from the keyboard. 
Use a loop to calculate the Armstrong number from “start” to “end”. 
Also, use loops to calculate the cube of a number. Do not use the Math.pow() function */

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Range: ");
        int start = sc.nextInt();

        System.out.println("Enter Ending Range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong Numbers between range " + start + " and " + end + " are : ");
        printArmstrongNumber(start, end);
        sc.close();
    }
    // Method for checking a number is Armstrong or not
    public static boolean isArmstrong(int num){
        int givenNum = num;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += (rem * rem * rem);
            num = num / 10;
        }
        return sum == givenNum;
    }
    // Print Armstrong Number
    public static void printArmstrongNumber( int start, int end) {
        for (int i = start; i <= end; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
