// LAB TASK 3

import java.util.Scanner;

public class EmployeeWageCalculator{
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);
	
	final int SECRET = 11;
	final double RATE = 12.50;
	int num1,num2,newNum;
	String name;
	double hoursWorked;
	double wages;
 
	System.out.print("Enter the value of num1 = ");
	num1 = console.nextInt();
	System.out.print("Enter the value of num2 = ");
	num2 = console.nextInt();

	System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2 + ".");
	 
	newNum = num1 * 2 + num2;
	System.out.println("The value stored in variable newNum = " + newNum);

	newNum = newNum + SECRET;
	System.out.print("The updated value of the variable newNum = ");
	System.out.println(newNum);

	System.out.print("Last name = ");
	name = console.next();

	System.out.print("Enter a decimal number between 0 and 70 : ");
	hoursWorked = console.nextDouble();

	wages = RATE * hoursWorked;
	System.out.println("The value stored in variable wages = " + wages);

	System.out.println("Name: " + name);
	System.out.println("Pay Rate: $ " + RATE);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Salary = $ " + wages);
	}
}

	

	
	
