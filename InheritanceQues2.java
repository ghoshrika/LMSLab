/* Question 2:
    Discount Calculation: In the context of an e-commerce platform, implement a discount system. 
    Create a base class for products and extend it to create subclasses for different discount 
    types (e.g., percentage-based, flat amount). How can you use inheritance and polymorphism 
    to calculate discounts? 
*/

class Product {
	protected String productName;
	protected double productPrice;

	public Product() {
		super();
	}

	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	//Getters-setters method for the attributes
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}

class PercentageDiscountProduct extends Product {
	private double discountPercentage;

	public PercentageDiscountProduct(String productName, double productPrice, double discountPercentage) {
		super(productName, productPrice);
		this.discountPercentage = discountPercentage;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double calculateDiscountedPrice() {
		double discountedPrice = productPrice - (productPrice * (discountPercentage / 100.0));
		return discountedPrice;
	}
}

class FlatDiscountProduct extends Product {
	private double discountAmount;

	public FlatDiscountProduct(String productName, double productPrice, double discountAmount) {
		super(productName, productPrice);
		this.discountAmount = discountAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double calculateDiscountedPrice() {
		double discountedPrice = productPrice - discountAmount;
		return discountedPrice;
	}
}

public class InheritanceQues2 {
    public static void main(String[] args) {
        PercentageDiscountProduct percentageDiscountProduct = new PercentageDiscountProduct("Samsung Galaxy M21", 18000, 20);
		System.out.println(percentageDiscountProduct.calculateDiscountedPrice());

		FlatDiscountProduct flatDiscountProduct = new FlatDiscountProduct("T-Shirt", 1100, 50);
		System.out.println("After Discount Price is: " + flatDiscountProduct.calculateDiscountedPrice());
    }
}
