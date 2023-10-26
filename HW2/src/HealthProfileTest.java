import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		//prompts a user to enter information
		System.out.println("Please enter your first name");
		String firstName = sc.nextLine();
		
		System.out.println("Please enter your Last name");
		String lastName = sc.nextLine();
		
		System.out.println("Please enter your gender");
		String gender = sc.nextLine();
		
		System.out.println("Please enter day of your date of birth");
		int day = sc.nextInt();
		
		System.out.println("Please enter month of your date of birth");
		int month = sc.nextInt();
		
		System.out.println("Please enter year");
		int year = sc.nextInt();
		
		System.out.println("Please enter your height");
		double height = sc.nextDouble();
		
		System.out.println("Please enter your weight");
		double weight = sc.nextDouble();
		
		
		//printing the user information
		System.out.println("Your health profile");
		System.out.println("--------------------");

		HealthProfile hr = new HealthProfile(firstName,lastName, gender, day ,month,year, height,weight );
		System.out.println("Your Firtst name: " + hr.getFname());
		System.out.println("Your Last name: " + hr.getLname());
		System.out.println("Your gender: " + hr.getGender());
		System.out.printf("Your date of birth: %d/%d/%d \nThe age:%d\n" , hr.getDay(), hr.getMonth(), hr.getYear(),hr.userAge());
		System.out.println("Your Maximum heart rate: " + hr.maxHeartRate());
		System.out.printf("Your Target heart range is: %d - %d\n" , hr.targetHeartRate1(), hr.targetHeartRate2());
		System.out.printf("Your Body Mass Index %.1f\n\n", hr.BodyMassIndex());
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.printf("Normal: between 18.5 and 24.9\n");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		

	}

}
