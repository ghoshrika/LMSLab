/* Question 4:
    Use a TreeSet to keep track of changing interest rates. 
    Implement methods to find the latest rate and historical trends. 
*/

import java.util.TreeSet;

class ChangingInterestRatesTracker{
    private TreeSet<Double> interestRate;

    // Constructor to initialize the TreeSet
    ChangingInterestRatesTracker(){
        this.interestRate = new TreeSet<>();
    }

    // Method to add a new interest rate
    public void addInterestRate(double rate){
        interestRate.add(rate);
    }

    // Method to get the latest interest rate 
    public double getLatestInterestRates(){
        return interestRate.last();
    }

    // Method to display historical trends
    public void displayHistoricalTrends() {
        System.out.println("Historical Interest Rates:");
        for (Double rate : interestRate) {
            System.out.println(rate);
        }
    }
}

public class Ques4 {
    public static void main(String[] args) {
        ChangingInterestRatesTracker irt = new ChangingInterestRatesTracker();

        // Adding interest rates
        irt.addInterestRate(3.25);
        irt.addInterestRate(3.5);
        irt.addInterestRate(2.75);
        irt.addInterestRate(2.5);

        System.out.println("Latest Rate: " + irt.getLatestInterestRates());

        // Displaying historical trends
        irt.displayHistoricalTrends();
    }
}
