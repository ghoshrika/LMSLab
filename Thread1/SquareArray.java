/* Question 2:
    Create a class that calculates the square of the array. The array values in the common 
    resource class must be passed by the main method or class that inherits the Runnable interface.
    The thread count must be more than two. Please observe the need for the Thread thread-safe 
    feature of the method that calculates the square feature. 
*/

import java.util.Arrays;

class CommonResource{
    private int[] array;

    public CommonResource(int[] array){
        this.array = array;
    }

    //Method to calculate the square of array elements
    public void calculateSquare(){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }

    //Method to display the array
    public int[] displayArray(){
        return array;
    } 
}

class SquareCalculator implements Runnable{
    CommonResource crs;

    public SquareCalculator(CommonResource crs){
        this.crs = crs;
    }

    @Override
    public void run() {
        //Invoking the method to calculate square
        crs.calculateSquare();
    }

}

public class SquareArray {
    public static void main(String[] args) {
        //Taking the original array
        int[] array = {10,15,20,25,30,35,40};
        System.out.println("Original Array: " + Arrays.toString(array));

        CommonResource crs = new CommonResource(array);
        int threadsNumber = 2;//Number of Threads

        Thread[] th = new Thread[threadsNumber];
        for(int i=0; i<threadsNumber; i++){
            th[i] = new Thread(new SquareCalculator(crs));
            th[i].start();
        }

        //Waiting for all threads to finish
        for(int i=0; i<threadsNumber; i++){
            try{
                th[i].join();
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }

       // Displaying the squared array
       System.out.println("Squared Array: " + Arrays.toString(crs.displayArray()));
    }
}
