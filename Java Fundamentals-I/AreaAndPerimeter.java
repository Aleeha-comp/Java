//LAB TASK 2

import java.util.*;

public class AreaAndPerimeter{
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);
 
	int length;
	int width;
	int area;
	int perimeter;

	System.out.print("Enter the width: "); 
	width = console.nextInt();

	System.out.print("Enter the length: ");
	length = console.nextInt();

	area = length * width;
	System.out.println("Area = " + area);

	perimeter = 2 * (length + width);
	System.out.println("Perimeter = " + perimeter);
	}
}

	

	
	