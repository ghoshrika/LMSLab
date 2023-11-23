/* Question 2: Scenario: Portfolio Management:
    In a portfolio management system, you need to calculate the total value of a portfolio. 
    Create an interface Portfolio with a method calculateTotalValue(). 
    Implement this interface in a class representing a portfolio of financial instruments. 
*/

interface Portfolio{
    double calculateTotalValue();
}

// Implement the Portfolio interface in a PortfolioManager class
class PortfolioManager implements Portfolio {
    private double totalValue = 0.0;

    // Add a financial instrument to the portfolio
    public void addInstrument(double value) {
        totalValue += value;
    }

    @Override
    public double calculateTotalValue() {
        return totalValue;
    }
}

public class Question2 {
    public static void main(String[] args) {
        // Create a portfolio manager
        PortfolioManager portfolioManager = new PortfolioManager();

        // Add financial instruments to the portfolio
        portfolioManager.addInstrument(1000.0);
        portfolioManager.addInstrument(1500.0);
        portfolioManager.addInstrument(800.0);
 
        // Calculate and print the total portfolio value
        double totalValue = portfolioManager.calculateTotalValue();
        System.out.println("Total Portfolio Value: $" + totalValue);
 
    }
}
