/* Question 3:
    Implement a HashSet to store information about client investments. 
    Each client should have a unique set of investments.
*/

import java.util.HashSet;
import java.util.Set;

class Client {
	private int clientId;
	private Set<String> clientInvestment;

    // Constructor to initialize the client with a unique ID
    public Client(int clientId){
        this.clientId = clientId;
        this.clientInvestment = new HashSet<>();
    }

    //Getter method for Client Id
    public int getClientId(){
        return clientId;
    }

    // Getter method for the set of client investments
    public Set<String> getClientInvestment(){
        return clientInvestment;
    }

    // Method to add an investment 
    public void addInvestment(String investment){
        clientInvestment.add(investment);
    }

    // toString method to display client information
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientInvestment=" + clientInvestment + "]";
	}
	

}

public class Ques3 {
	public static void main(String[] args) {
        Client c1 = new Client(101);
        Client c2 = new Client(102);
        Client c3 = new Client(103);

        // Adding investments for each client
        c1.addInvestment("Stock");
        c1.addInvestment("Real Estate");
        c2.addInvestment("Bond");
        c2.addInvestment("Mutual Funds");
        c3.addInvestment("Gold Bonds");
        c3.addInvestment("Bitcoin");

        //Display client information
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
	}
}
