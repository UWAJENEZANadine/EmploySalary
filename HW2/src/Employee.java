
public class Employee {
	
	//declaring instance variables 
	private String firstName;
	private String lastName;
	private double monthSalary;
	
	//Defining a constructor for initialising the instance variable
	public Employee(String firstName, String lastName,double monthSalary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthSalary>0) {
			this.monthSalary = monthSalary;	
		}
		
	}

	
	//creating setter and getter methods

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthSalary() {
		return monthSalary;
	}


	public void setMonthSalary(double monthSalary) {
		if (monthSalary>0) {
			this.monthSalary = monthSalary;	
		}
		System.out.println("Please a salaray shoul be a positive");
		
	}
	
	//calculating of year salary
	
	public double yearSalary() {
		return monthSalary *12;
		
	}
	
	//give a raise of 10%
	public void giveRaise() {
		monthSalary *=1.10;
		
	}
	

}




