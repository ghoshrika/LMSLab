/* Question 1:
    Write a Java program that takes an array of integers as input from the user and 
    then calculates the sum and average of the elements in the array. 
    The program should output the sum and average. 
*/

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int sum =0;
        double average = 0;
        Scanner sc = new Scanner(System.in);

        //Take input for the size of the array
        System.out.println("Enter size of the array: ");
        int length = sc.nextInt();

        //Declare the array
        int[] arr = new int[length];

        //Take elements of array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        //calculate sum and average of the elements
        for(int j=0; j<arr.length; j++){
            sum = sum+arr[j];
        }
        System.out.println("Sum of the elements is: " + sum);
        average = sum / length;
        System.out.println("Average of the elements is: " + average);
        sc.close();
    }
}
