package example;
public class StudentDemo {
	public static void main(String[] args) {
		// creating an instance/object of class student
		Student st = new Student(1, "Heng Nas","Male");
		
		// calling the getter methods
		System.out.println("Roll Number :" + st.getRolloNo());
		System.out.println("Student Name:" + st.getName());
		System.out.println("Gender      :" + st.getSex());
	}
}
