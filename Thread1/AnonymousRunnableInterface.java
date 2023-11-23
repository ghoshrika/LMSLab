/* Question 1:
    Create a Thread using an anonymous Runnable interface. 
*/

public class AnonymousRunnableInterface {
    public static void main(String[] args) {
        // Creating a thread using an anonymous Runnable interface
        Thread th1 = new Thread(new Runnable() {

            @Override
            public void run() {
             for(int i=0; i<=5; i++){
                System.out.println("Thread - " + Thread.currentThread().getName() + " " +i);
                try {
                    //Use a delay of 1 second
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
             }
            }
            
        });
        //Starting the thread
        th1.start();

        for(int i=0; i<=5; i++){
            System.out.println("Thread - " + Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
               System.out.println(ie.getMessage());
            }
        }
    }
}
