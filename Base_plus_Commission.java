package Employee;

//Extends the superclass "CommissionEmployee"
public class Base_plus_Commission extends CommissionEmployee {

	//Declare a variable with double data type
	private double baseSalary;
	
	//Declare a constructor to initialize the variables
	public Base_plus_Commission(String fName, String lName, String sin, double grossSales, double commissionRate, double baseSalary)
	{
		super(fName, lName, sin, grossSales, commissionRate); //Call the constructor from the superclass, "CommissionEmployee"
		this.baseSalary = baseSalary;
	}
	
	//Setter and getter methods
	public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}
	public double getBaseSalary() {return baseSalary;}
	
	public double earnings() {
		return (super.getCommissionRate() * super.getGrossSales()) + (getBaseSalary() * 1.10);
	}
	
	public String toString() {
		return "Base Salaried " + super.toString()	+ "\nBase Salary: " + getBaseSalary();
	}
	
	
	public static void main(String[] args) {
		//Instantiate the subclass "Base_plus_Commission". The new object's name is "emp4."
		Base_plus_Commission emp4 = new Base_plus_Commission("Yuriko", "Uchida", "123-444-555", 1000, 0.4, 300);

		//Print the output of emp4
		System.out.println(emp4.toString());
		System.out.println(emp4.earnings());
	}//End of the main class

}//End of the class
