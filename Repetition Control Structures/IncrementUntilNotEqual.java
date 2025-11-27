import java.util.*;

public class IncrementUntilNotEqual{
	public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //Part a
        int A;
        int B;
        System.out.print("A : ");
        A = input.nextInt();
        System.out.print("B : ");
        B = input.nextInt();

        while (A<=B){
            System.out.println(A);
            A++;
        }
    }
}
