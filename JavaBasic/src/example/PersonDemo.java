package example;
public class PersonDemo {

	public static void main(String[] args) {
		// Instantiation: Create an object/instance
		// ClassName ObjectName = new ConstructorName([parameter_list])
		Person p = new Person();
		
		//calling the data members and get values
		//ObjectName.dataMemberName = values;
		p.name = "Heng Dara";
		p.sex = "Male";
		p.age = 25;
		
		//calling the data members and get value
		//varName = ObjectName.dataMemberName;
		//String name = p.name;
		System.out.println("Name : " + p.name);
		System.out.println("Sex  : " + p.sex);
		System.out.println("Age  : " + p.age);
		
		//Calling the member methods
		//ObjectName.MethodName([parameter_list]);
		p.run();
		p.walk();
	}

}
