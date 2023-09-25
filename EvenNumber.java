// Create a Java program that prints all even numbers from 1 to 20 using a while loop.
public class EvenNumber {
    public static void main(String[] args) {
        int num=1;
        System.out.println("All even numbers from 1 to 20 Below");
        while (num<=20)
        {
            if (num%2==0)
            {
                System.out.print(num+ " ");   
            }  
            num++;
        }
    }
}
