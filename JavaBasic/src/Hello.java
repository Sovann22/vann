import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		String name; // variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		System.out.print("My name is");
		name = sc.nextLine();
		System.out.println("Hello"+ name + "!");
		sc.close();
	}
}