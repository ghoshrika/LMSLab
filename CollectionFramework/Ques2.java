/* Question 2: Remove Elements:
    Remove the element at index 2 from the ArrayList. Display the updated contents. 
*/

import java.util.ArrayList;

public class Ques2 {
    public static void main(String[] args) {
         //creating the ArrayList of Integers
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //adding element to ArrayList
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Display content of ArrayList
        System.out.println("Created ArrayList: " + list1);

        //Remove element at index 2
        list1.remove(2);
        System.out.println("After remove element ArrayList: " + list1);
    }
}
