/* Question 6: Clear and Check:
    Clear all elements from the ArrayList and display its size. Check if it is empty. 
*/

import java.util.ArrayList;

public class Ques6 {
    public static void main(String[] args) {
        //Creating a ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Adding elements to ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        //Display the Arraylist
        System.out.println("Original ArrayList: " + arrayList);

        //Clear all elements
        arrayList.clear();
        //Displaying size
        System.out.println("After clear all elements size of the ArrayList: " + arrayList.size());

        //Checking if it is empty
        System.out.println("Is the ArrayList empty ? : " + arrayList.isEmpty());
    }
}
