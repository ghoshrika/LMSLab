/* 3. Write a program to count and print the total number of odd and even numbers from 
user inputs. The program will ask for user inputs in a loop. 
The loop will terminate if -1 is entered as input. */

import java.util.Scanner;

public class NumberOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfEven = 0;
        int numberOfOdd = 0;
        int number;
        System.out.println("Enter Number (The loop will terminate if -1 is entered as input) : ");
        while(true){
            number = sc.nextInt();

            if(number == -1){
                break;
            }
            else if(number % 2 == 0){
                numberOfEven++;
            }
            else{
                numberOfOdd++;
            }
        }
        System.out.println("Total Even numbers: " + numberOfEven);
        System.out.println("Total Odd numbers: " + numberOfOdd);
        sc.close();
    }
}
