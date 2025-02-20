import java.util.Scanner;

public class Practies4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number :");
		int num1 = scanner.nextInt();
		System.out.print("Enter Second Number:");
		int num2 = scanner.nextInt();
		
		String str = "-----------------------";
		System.out.println(str);
		System.out.println("Addition         :" + (num1 + num2));
		System.out.println("Subtration       :" + (num1 - num2));
		System.out.println("Multiplication   :" + (num1 * num2));
		System.out.println("Division         :" + (num1 / num2));
		System.err.println(str);
		scanner.close();
	}

}
