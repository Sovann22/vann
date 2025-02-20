import java.util.Scanner;

public class Practies3 {

	public static void main(String[] args) {
		String name,DOB,Mobile; // variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name    :");
		name = sc.nextLine();
		System.out.print("Enter DOB     :");
		DOB = sc.nextLine();
		System.out.print("Enter Mobile  :");
		Mobile = sc.nextLine();
		
		System.out.println(".................................");
		System.out.println("Name   :"+ name);
		System.out.println("DOB    :"+ DOB);
		System.out.println("Mobile :"+ Mobile);
		System.out.println(".................................");
		sc.close();
	}

}
