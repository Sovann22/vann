package example;
public class Student {
	// data members, member variable, fields
	private int rollno;
	private String name;
	private String sex;
	
	// constructors
	Student(int rollno){
		this.rollno = rollno;
	}
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	Student(int rollno,String name,String sex){
		this.rollno = rollno;
		this.name = name;
		this.sex = sex;
	}
	//getter methods
	public int getRolloNo() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
}
