import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Day :");
		int num1 = scanner.nextInt();
		System.out.print("Years:");
		int num2 = scanner.nextInt();
		System.out.print("Weeks :");
		int num3 = scanner.nextInt();
		System.out.print("Days:");
		int num4 = scanner.nextInt();
		
		String str = "-----------------------";
		System.out.println(str);
		System.out.println("Addition         :" + (num1 + num2));
		System.out.println("Subtration       :" + (num2 - num2));
		System.out.println("Multiplication   :" + (num3 * num2));
		System.out.println("Division         :" + (num4 / num2));
		System.err.println(str);
		scanner.close();
	}

}
