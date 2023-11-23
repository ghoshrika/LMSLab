/* Designing a Restaurant Menu

    You are tasked with developing a program to represent a restaurant's menu items. The menu 
    includes various types of items, such as appetizers, main courses, and desserts. These items 
    share some common properties, such as name, description, and price, but also have unique 
    characteristics. Explain how you would use abstract classes and interfaces to create a 
    hierarchy of menu items with shared properties and methods. 
*/

//Abstract class representing a menu item
abstract class MenuItem{
    private String name;
	private String description;
	private double price;

	public MenuItem() {
		super();
	}

	public MenuItem(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    @Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}

//Interfaces for different menu item catagories
interface Appetizers{
    void chooseSpicenessLevel(int level);
}

interface MainCourses{
    void selectSize(String size);
}

interface Desserts{
   void specifyCalories(int calories); 
}

// Salad class that extends MenuItem and also implements Appetizers interface
class Salad extends MenuItem implements Appetizers {
	private int spicinessLevel;

	public Salad() {
		super();

	}

	Salad(String name, String description, double price) {
		super(name, description, price);
	}

	@Override
	public void chooseSpicenessLevel(int level) {
		this.spicinessLevel = level;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalad [spicinessLevel=" + spicinessLevel + "]";
    }
}

// pizza class that extends Menuitem and also implements MainCourses interface
class Pizza extends MenuItem implements MainCourses{
	private String size;

	public Pizza(){
		super();
	}

	public Pizza(String name, String description, double price){
		super(name, description, price);
	}

	@Override
	public void selectSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPizza [size=" + size + "]";
    }
	
}

// ChesseCake class that extends MenuItem and also implements Desserts interface
class CheeseCake extends MenuItem implements Desserts {
	private int calories;

	public CheeseCake() {
		super();
	}

    public CheeseCake(String name, String description, double price) {
		super(name, description, price);
	}

	@Override
	public void specifyCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {

		return super.toString() + "\nCheeseCake [calories=" + calories + "]";
	}
}


public class Question3 {
    public static void main(String[] args) {
		
        // Creating menu items and setting their specific properties
		CheeseCake cheeseCake = new CheeseCake("DoubleChees Cake", "It is best suitable for BirthDay", 550);
		cheeseCake.specifyCalories(250);

		Salad salad = new Salad("Spicy Salad Chat", "It is our Special Menu of the Day", 220);
		salad.chooseSpicenessLevel(2);

		Pizza pizza = new Pizza("Double Chesse Pizza", "It is for chesse lover.", 350);
		pizza.selectSize("Large");

		//Printing all details
		System.out.println(cheeseCake);
		System.out.println(salad);
		System.out.println(pizza);

    }
}
