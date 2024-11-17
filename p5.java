import java.util.Scanner;

public class p5 {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		System.out.print("enter number 1: ");
		int n1 = sc.nextInt();
        System.out.print("enter number 1: ");
        int n2 = sc.nextInt();
        System.out.print("Summation: "+(n1+n2));
        System.out.print("Subtraction: " + (n1 - n2));
        System.out.print("Multiplication: " + (n1 * n2));
        System.out.print("Division: " + (n1 / n2));

	}
}
