/* 2. Write a program to calculate the gross salary of a group of employees. 
A basic salary should be taken from the user.
If the basic salary is greater than 15000, HRA=20% and DA=60% will be given, 
else HRA=3000 and DA 70% will be given to the employee.

Note: Input of basic salary will be taken from the keyboard. 
After calculating the salary of one employee, the program will ask for 
the user's choice as int. If “-1” is entered then the loop will continue and 
the loop will exit for other int inputs. */

import java.util.Scanner;

public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextInt();
        double HRA,DA,grossSalary;

        if(basicSalary > 15000){
            HRA = 0.20 * basicSalary;
            DA = 0.60 * basicSalary;
        }
        else{
            HRA = 3000;
            DA = 0.70 * basicSalary;
        }
        grossSalary = HRA + DA + basicSalary;
        System.out.println("Gross Salary is: " + grossSalary);

        System.out.println("Enter -1 to calculate gross salary for other more person or enter any other integer to exit: ");
        choice = sc.nextInt();
        }while(choice == -1);
        System.out.println("EXIT");
        sc.close();
    }
}
