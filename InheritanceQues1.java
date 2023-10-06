/* Question 1:
    Employee Hierarchy: In a business application, you have a base class Employee with attributes 
    like name, id, and salary. Implement two subclasses, Manager and RegularEmployee, inheriting 
    from Employee. How would you structure the classes to represent the hierarchy effectively? 
*/

class Employee{
    protected String employeeName;
    protected int employeeId;
    protected double employeeSalary;

    public Employee() {
		super();
	}

    public Employee(String employeeName, int employeeId, double employeeSalary){
        super();
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    //Getters and setters method for the attributes
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public double getEmployeeSalary(){
        return employeeSalary;
    }
    public void setemployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    //Common method to display all information
    public void display(){
        System.out.println("Employee Name: " + employeeName + "\nEmployee Id: " + employeeId + "\nSalary: " + employeeSalary);
    }
}

class Manager extends Employee{
    protected String department;

    public Manager(String employeeName, int employeeId, double employeeSalary, String department){
        super(employeeName, employeeId, employeeSalary);
        this.department = department;
    }

    //Getter and Setter method for department
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    //Method to show department
    public void showDept(){
        System.out.println(getEmployeeName() + " is a Manager.");
    }
}

class RegularEmployee extends Employee{
    public RegularEmployee(String employeeName, int employeeId, double employeeSalary){
        super(employeeName, employeeId, employeeSalary);
    }

    public void showDept(){
        System.out.println(getEmployeeName() + " is a Regular Employee.");
    }
}

public class InheritanceQues1 {
    public static void main(String[] args) {
        Manager manager = new Manager("Ram", 101,40000, "Manager");
        RegularEmployee emp1 = new RegularEmployee("Raman", 202, 25000);
        manager.display();
        manager.showDept();

        System.out.println();

        emp1.display();
        emp1.showDept();
    }
}
