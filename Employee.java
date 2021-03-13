/*
Student Name: Yuriko Uchida
Student Number : #200448500

Due Date: Thursday, February 18th
Assignment Name: Lab 2
Course Name: Intro Obj Oriented Prog-Java
*/


package Employee;

//Declare an interface "emp"
interface emp {
	double earnings();
	String toString();
}//End of the interface


//Implement the above interface, "emp"
abstract public class Employee implements emp{
	
	//Declare empty variables with String data type
	private String firstName, lastName, socialInsuranceNumber;

	//Constructors with three parameters
	public Employee(String fName, String lName, String sin) {
		this.firstName = fName;
		this.lastName = lName;
		this.socialInsuranceNumber = sin;
	}
	
	//Abstract method
	abstract public double earnings();
	
	public String toString()
	{
		return this.firstName + " " + this.lastName + "\nSocial Insurance Number: " + this.socialInsuranceNumber;		
	}
	
	
}//End of the abstract superclass