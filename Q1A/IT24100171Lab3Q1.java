import java.util.Scanner;

public class IT24100171Lab3Q1{
	public  static void main (String[]args){
		double pricePerKg,quantity,totalAmount,discountTotal,finalAmount;
		double discount = 0.10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price of 1kg rice:");
		pricePerKg = input.nextDouble();
		System.out.print("Enter the number of kilograms:");
		quantity = input.nextDouble();
		totalAmount = pricePerKg*quantity;
		System.out.print("total amount is :"+totalAmount);
		discountTotal = totalAmount*discount;
		finalAmount = totalAmount - discountTotal;
		System.out.println();
		System.out.print("the total amount with 10% discount is:" + finalAmount);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}