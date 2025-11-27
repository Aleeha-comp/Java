import java.util.*;

public class SumOfCubes{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
       
	//Part 4
        int Number = input.nextInt();
        int Sum = 0;
        int x = 1;
        while (x <= Number){
            Sum = Sum + (int)(Math.pow(x,3));
            x++;
        }
        System.out.println("Sum = " + Sum);

	}
}

