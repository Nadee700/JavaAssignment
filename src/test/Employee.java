package test;

public class Employee {
	String name;
	int age;
	String designation;
	
	public Employee(){}
	
	public Employee(String name , int age, String designation){
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public void printDetails(String name , int age, String designation){
		System.out.println("Employeee Name is : " + name);
		System.out.println("Emplyoee Age is :" + age);
		System.out.println("Employee Designation is :" + designation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.printDetails("John" , 24, "Software Engineering");
		
	}

}
