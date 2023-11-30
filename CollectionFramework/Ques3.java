/* Question 3: Size and Capacity:
    Find and display the size and capacity of the ArrayList after adding 5 more elements. 
*/

import java.util.ArrayList;

public class Ques3 {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numberList = new ArrayList<>();

        // Adding elements to the ArrayList
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        // Displaying the size and (indirectly) the initial capacity of the ArrayList
        System.out.println("Initial size: " + numberList.size());
        System.out.println("Initial capacity (indirect): " + getCapacity(numberList));

        // Adding 5 more elements to the ArrayList
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);

        // Displaying the size and (indirectly) the updated capacity of the ArrayList
        System.out.println("Updated size: " + numberList.size());
        System.out.println("Updated capacity (indirect): " + getCapacity(numberList));
    }

    // A method to indirectly get the capacity of an ArrayList
    private static int getCapacity(ArrayList<?> list) {
        return ((Object[]) list.toArray()).length;
    }
}
