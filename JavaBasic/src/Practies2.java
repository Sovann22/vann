import java.util.Scanner;

public class Practies2 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String name,DOB,Mobile; // variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Name    :");
		name = sc.nextLine();
		System.out.print("DOB     :");
		DOB = sc.nextLine();
		System.out.print("Mobile  :");
		Mobile = sc.nextLine();
		sc.close();
	}

}
