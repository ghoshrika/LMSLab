/* Question 2:
    Write a Java program that takes an array of integers as input and 
    sorts it in ascending order using any sorting algorithm of your choice.
    Print the sorted array. 
*/

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input for the size of array.
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        // take input for elements of array
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        //Display the array
        System.out.println("The original array is: ");
        System.out.print("[");
        for(int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println("]");

        //Sorting of array
        for(int k=0; k<array.length-1; k++){
            for(int m=0; m<array.length-k-1; m++){
                if(array[m] > array[m+1]){
                    int temp = array[m];
                    array[m] = array[m+1];
                    array[m+1] = temp;
                }
            }
        }
        System.out.println("After sorting the new array is: ");
        System.out.print("[");
        for(int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println("]");

        sc.close();
    }
}
