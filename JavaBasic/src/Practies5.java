import java.util.Scanner;

public class Practies5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scanner.nextLine();
		String strreversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string : " + strreversed);
		scanner.close();
		}

}
