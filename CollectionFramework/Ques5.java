/* Question 5: Sublist Extraction:
    Create a sublist from index 1 to 3 of the original ArrayList. 
    Display the elements of the sublist. 
*/

import java.util.ArrayList;
import java.util.List;

public class Ques5 {
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

        //Creating sublist from the original ArrayList
        List<Integer> subList = arrayList.subList(1, 3);
        //Display the sublist
        System.out.println("Elements of the SubList: " + subList);

    }
}
