import java.util.Scanner;

public class IT24100171Lab3Q2{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthlySalary:");
		
		double monthlySalary = input.nextDouble();
		System.out.print("Enter the otHours:");
		
		double otHours = input.nextDouble();
		System.out.print("Enter the otHourlyRate:");
		
		double otHourlyRate = input.nextDouble();
		
		double otAmmount = (otHours*otHourlyRate);
		System.out.print("The OT Ammount is:" + otAmmount);
		System.out.println();
		double totalSalary = (otAmmount + monthlySalary);
		System.out.print("The Monthly Salary including OT is:" + totalSalary);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
