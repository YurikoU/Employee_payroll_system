package Employee;

//Extends the abstract superclass, "Employee"
public class CommissionEmployee extends Employee {

	//Declare variables with double data type
	private double grossSales, commissionRate;
	
	//Declare a constructor to initialize the variables
	public CommissionEmployee(String fName, String lName, String sin, double grossSales, double commissionRate)
	{
		super(fName, lName, sin); //Call the constructor from the superclass
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	//Setter and getter methods
	public void setGrossSales(double grossSales) {this.grossSales = grossSales;}
	public void setCommissionRate(double commissionRate) {this.commissionRate = commissionRate;}
	public double getGrossSales() {return grossSales;}
	public double getCommissionRate() {return commissionRate;}
	
	public double earnings() {
		return getCommissionRate() * getGrossSales();		
	}
	
	public String toString() {
		return "Commission Employee: " + super.toString() + "\nGross Sales: " +   getGrossSales() + "\nCommission Rate: " +  getCommissionRate();
	}
	
	
	public static void main(String[] args) {
		//Instantiate the subclass "CommissionEmployee". The new object's name is "emp3."
		CommissionEmployee emp3 = new CommissionEmployee("Yuriko", "Uchida", "123-444-555", 1000, 0.40);

		//Print the output of emp3
		System.out.println(emp3.toString());
		System.out.println(emp3.earnings());
	}//End of the main class

	
}//End of the class
