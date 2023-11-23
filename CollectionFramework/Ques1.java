/* Create an ArrayList of integers and add elements 1, 2, 3 to it. 
    Display the contents of the ArrayList.
*/

import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        //creating the ArrayList of Integers
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //adding element to ArrayList
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Display content of ArrayList
        System.out.println("Created ArrayList: " + list1);  

    }
}
