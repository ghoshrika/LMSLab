/* Scenario: Tax Calculation:
    In a financial application, you need to calculate tax for different types of investments. 
    Create an interface Taxable with a method calculateTax(). Implement this interface in classes 
    representing different investments, such as stocks, bonds, and real estate.
*/

interface Texable{
    double calculateTax();
}

class Stocks implements Texable{
    private double value;
    public Stocks(double value){
        this.value = value;
    }

    @Override
    public double calculateTax() {
        //Implementation of tax calculation for Stocks
        return (0.10 * value);
    }
    
}

class Bonds implements Texable{
    private double value;
    public Bonds(double value){
        this.value=value;
    }

    @Override
    public double calculateTax() {
        //Implementation of tax calculation for Bonds
        return (0.10*value);
    }
    
}

class RealEstate implements Texable{
    private double value;
    public RealEstate(double value){
        this.value = value;
    }

    @Override
    public double calculateTax() {
        //Implementation of tax calculation for Bonds
        return (0.20 * value);
    }
    
}

public class Question1 {
    public static void main(String[] args) {
        Texable s = new Stocks(20000.0);
        System.out.println("Stock's Tax: " + s.calculateTax());

        Texable b = new Bonds(30000.0);
        System.out.println("Bond's Tax: " + b.calculateTax());

        Texable re = new RealEstate(40000.0);
        System.out.println("Real Estate's Tax: " + re.calculateTax());
    }
}
