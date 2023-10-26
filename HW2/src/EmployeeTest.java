
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating two objects
		Employee emp1 = new Employee("Nadine ", "Uwajeneza ", 10000);
		Employee emp2 = new Employee("Prosper ", "Singadi ", 20000);
		
		
		//display employee salary yearly before the raise
		String fname1 = emp1.getFirstName();
		String Lname1 = emp1.getLastName();
		Double yearSalary1 = emp1.yearSalary();
		
		String fname2 = emp2.getFirstName();
		String Lname2 = emp2.getLastName();
		double yearSalary2 = emp2.yearSalary();
		
		
		
		System.out.println("Yearly salary: " + fname1 + "" + Lname1 + "" + yearSalary1);
		System.out.println("Yearly salary: " + fname2 + "" + Lname2 + "" + yearSalary2);
		
		
		//give employee a raise of 10%
		
		emp1.giveRaise();
		emp2.giveRaise();
		
		//recalculate year salary after raise
		 yearSalary1 = emp1.yearSalary();
		yearSalary2 = emp2.yearSalary();
		
		System.out.println("Yearly salary after raise of 10% %: " + fname1 + "" + Lname1 + "" + yearSalary1);
		System.out.println("Yearly salary after raise of 10% %: " + fname2 + "" + Lname2 + "" + yearSalary2);
		
		
		

	}

}
