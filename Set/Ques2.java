/* Question 2:
    Use a TreeSet to maintain a sorted set of risk scores associated with financial assets. 
*/

import java.util.Set;
import java.util.TreeSet;

// Class representing a financial asset
class FinancialAsset implements Comparable<FinancialAsset>{
    private String assetName;
    private double riskScore;

    // Constructor to initialize the financial asset with a name and risk score
    public FinancialAsset(String assetName, double riskScore){
        this.assetName = assetName;
        this.riskScore = riskScore;
    }

    public String getAssetName(){
        return assetName;
    }
    public double getRiskScore(){
        return riskScore;
    }

    // toString method for a string representation of the financial asset
    public String toString() {
        return "Asset: " + assetName + ", Risk Score: " + riskScore;
    }

    public int compareTo(FinancialAsset other) {
        // Compare FinancialAsset objects based on their risk scores
        return Double.compare(this.riskScore, other.getRiskScore());
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Set<FinancialAsset> riskScore = new TreeSet<>();

        // Add financial assets to the TreeSet
        riskScore.add(new FinancialAsset("Asset1", 4.2));
        riskScore.add(new FinancialAsset("Asset2", 3.5));
        riskScore.add(new FinancialAsset("Asset3", 5.7));
        
        //Display financial asset
        for (FinancialAsset financialAsset : riskScore) {
            System.out.println(financialAsset);
        }
    }
}
