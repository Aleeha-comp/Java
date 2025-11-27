import java.util.*;

public class IncrementOrDecrement{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //Part b
        System.out.print("A : ");
        int A = input.nextInt();
        System.out.print("B : ");
        int B = input.nextInt();

        while (A<B){
            System.out.println(A);
            A++;
        }
        while (A>=B){
            System.out.println(A);
            A--;
        }
    }
}
