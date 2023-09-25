/* Create a Java program that uses a while loop to find the sum of all numbers from 1 to 100.
*/

public class SumOfNumber {
    public static void main(String[] args) {
        int num=1;
        int sum = 0;
        while (num <= 100){
            sum = (num*(num+1))/2;
            num++;
        }
        System.out.println("Sum of all numbers from 1 to 100 "+sum);
    }
}
