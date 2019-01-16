package test;

public class Employee {
	String name;
	int age;
	
	public Employee(){}
	
	public Employee(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public void printDetails(String name , int age){
		System.out.println("Employeee Name is  jhh : " + name);
		System.out.println("Emplyoee Age is :" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.printDetails("Nadee" , 24);
		
	}

}
