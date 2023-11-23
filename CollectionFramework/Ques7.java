/* Question 7: Sort Elements:
    Add random integers to the ArrayList and sort them in ascending order. 
    Display the sorted list. 
*/

import java.util.ArrayList;
import java.util.Collections;

public class Ques7 {
    public static void main(String[] args) {
        //Creating a Arraylist
        ArrayList<Integer> al = new ArrayList<>();

        //Adding Elements
        al.add(80);
        al.add(50);
        al.add(95);
        al.add(10);
        al.add(100);
        al.add(75);

        //Displaying the ArrayList
        System.out.println("Created ArrayList: " + al);

        //Sorting in ascending order
        Collections.sort(al);

        //Displaying after sorting
        System.out.println("After sorting the new ArrayList is: " + al);
    }
}
