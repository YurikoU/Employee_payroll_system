package Employee;

//Extends the abstract superclass, "Employee"
public class HourlyEmployee extends Employee {

	//Declare variables with double data type
	private double wage, hours;
	
	//Declare a constructor to initialize the variables
	public HourlyEmployee(String fName, String lName, String sin, double wage, double hours)
	{
		super(fName, lName, sin); //Call the constructor from the superclass
		this.wage = wage;
		this.hours = hours;
	}
	
	//Setter and getter methods
	public void setWage(double wage) {this.wage = wage;}
	public void setHours(double hours) {this.hours = hours;}
	public double getWage() {return wage;}
	public double getHours() {return hours;}
	
	public double earnings() {
		if (getHours() <= 40)
		{
			return getWage() * getHours();			
		}
		else 
		{
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	public String toString() {
		return "Hourly Employee: " + super.toString() + "\nHourly Wage: " +  getWage() + "\nHours Worked: " + getHours();
	}
	
	public static void main(String[] args) {
		//Instantiate the subclass "HourlyEmployee". The new object's name is "emp2."
		HourlyEmployee emp2 = new HourlyEmployee("Yuriko", "Uchida", "123-444-555", 15.00, 30.5);

		//Print the output of emp2
		System.out.println(emp2.toString());
		System.out.println(emp2.earnings());
	}//End of the main class

}//end of the class
