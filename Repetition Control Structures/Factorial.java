import java.util.*;

public class Factorial{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	int n = console.nextInt();
	int x = 1;
	int multiply = 1;
	while ( x <= n){
	  multiply = multiply * x;
	  x++;
	}
	System.out.println("Factorial of " + n + " = " + multiply);
	
	console.close();
	}
}