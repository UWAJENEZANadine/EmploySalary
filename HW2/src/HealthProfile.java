
public class HealthProfile {
	
	//declare instance variable
	private String fname;
	private String lname;
	private String gender;
	private int day;
	private int month;
	private int year;
	private double height_inch;
	private double weight_pound;
	
	
	//initialise a constructor
	
	public HealthProfile(String fname, String lname,String gender,int day, int month,int year,double height_inch, double weight_pound) {
		
		this.fname = fname;
		this.lname =lname;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
		this.height_inch = height_inch;
		this.weight_pound = weight_pound ; 
	}

	
	//creating getter and setter methods
	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getHeight_inch() {
		return height_inch;
	}


	public void setHeight_inch(double height_inch) {
		this.height_inch = height_inch;
	}


	public double getWeight_pound() {
		return weight_pound;
	}


	public void setWeight_pound(double weight_pound) {
		this.weight_pound = weight_pound;
	}
	
	//Method that calculate and return the age
	public int userAge() {
		
		int age= 2023-year;
		return age;
	}
	
	// method that calculate and return the maximum heart rate per minute
	
	public int maxHeartRate() {
		int maxRate = 220 - userAge();
		return maxRate;
		
	}
	// Method that calculate the target heart rate in range of 50 - 85%
	
	public int targetHeartRate1() {
		int targetRate = (int) (maxHeartRate()*0.5);
		return targetRate ;
		
	}
	public int targetHeartRate2() {
		int targetRate = (int) (maxHeartRate()*0.85);
		return targetRate ;
		
	}
	public double BodyMassIndex() {
		double bmi =(weight_pound * 703)/(height_inch * height_inch);
		return bmi;
	
	}

	
	
	

}
