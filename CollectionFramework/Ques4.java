/* Question 4: Search and Replace:
    Check if the ArrayList contains the element 3. If found, replace it with 10 
    and display the updated list. 
*/

import java.util.ArrayList;

public class Ques4 {
    public static void main(String[] args) {
        //creating the ArrayList of Integers
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //adding element to ArrayList
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Display content of ArrayList
        System.out.println("Created ArrayList: " + list1);

        System.out.println("Original ArrayList: " + list1);
        int element = 3;
        System.out.println("ArrayList contain the element " + element + " ?: " + list1.contains(3));
        list1.set(list1.indexOf(3), 10);
        System.out.println("Updated ArrayList: " + list1);
    }
}
