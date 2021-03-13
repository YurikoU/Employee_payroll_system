package Employee;

//Extends the abstract superclass, "Employee"
public class SalariedEmployee extends Employee {

    //Declare a variable with double data type
	private double weeklySalary;
	
	//Declare a constructor to initialize the variables
	public SalariedEmployee(String fName, String lName, String sin, double weeklySalary)
	{
		super(fName, lName, sin); //Call the constructor from the superclass
		this.weeklySalary = weeklySalary;
	}

	//Setter and getter methods
	public void setWeeklySalary(double weeklySalary) {this.weeklySalary = weeklySalary;}
	public double getWeeklySalary() {return weeklySalary;}

	public double earnings() {
		return getWeeklySalary();
	}
	
	public String toString() {
		return "Salaried Employee: " + super.toString() + "\nWeekly Salary: " + earnings();
	}
	

	
	public static void main(String[] args) {
		//Instantiate the subclass "SalariedEmployee". The new object's name is "emp1."
		SalariedEmployee emp1 = new SalariedEmployee("Yuriko", "Uchida", "123-444-555", 500);

		//Print the output of emp1
		System.out.println(emp1.toString());
		System.out.println(emp1.earnings());
	}//End of the main class
	
}//End of the class
