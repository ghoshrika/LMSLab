/* Question 3: Size and Capacity:
    Find and display the size and capacity of the ArrayList after adding 5 more elements. 
*/

import java.util.ArrayList;

public class Ques3 {
    public static void main(String[] args) {
        //creating the ArrayList of Integers
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //adding element to ArrayList
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Display content of ArrayList
        System.out.println("Created ArrayList: " + list1);

        System.out.println("Size of ArrayList: " + list1.size());

        //adding 5 more elements
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        //After adding display new ArrayList
        System.out.println("New ArrayList: " + list1);
        System.out.println("New size: " + list1.size());

    }
}
