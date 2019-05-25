/**
 * 
 */

/**
 * @author aganguli
 *
 */import java.util.Scanner;
 import java.text.NumberFormat;
 
 
public class CPSC50100Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int PickUp = 0;
		final int Delivery = 1;
		int answer;
		
		int Delivery_Fee = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome, is this order for Pick-up or delivery?");
		System.out.print("Please type \"1\" for Delivery or \"0\" for Pick-Up: ");
		answer = scan.nextInt();
		
		while (answer > 1 || answer <0)
			{
			System.out.print("Invalid input. Please reenter: ");
			answer = scan.nextInt();
			}
			if (answer == 1)
				{
				int zip;
			
				System.out.print("Please enter your zip code: ");
				zip = scan.nextInt();
				
				if (zip >= 60441 && zip <= 60451 )
					if (zip >= 60442 && zip <= 60450)
						{
						System.out.println("Delivery available");
						Delivery_Fee = 5;
						}
					else
					{
						System.out.println("Delivery available with extra delivery fee");
						Delivery_Fee = 7;
					}
				else
					{
					System.out.println("Delivery not availble");
					System.out.print("Enter \"0\" if you would like to order Pick-Up: ");
					answer = scan.nextInt();
					}
					
				}
			else
				Delivery_Fee = 0;
			
			
			double A = 4.50;
			double B = 1.50;
			double C = 2.50;
			double D = 3.00;
			
			int QA, QB, QC, QD;
			double subtotal;
			
			
			double Total;
			final double TAX_RATE = 0.05;
			
			NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
			NumberFormat fmt2 = NumberFormat.getPercentInstance();
			
			
			System.out.println();
			System.out.println("Here is the menu: \n \n Flyers' Burgers: $4.50 per order \n Flyers' Drink: $1.50 per container \n" +
					" Flyers' Fries: $2.50 per order \n Flyers' Dessert: $3.00 per order");
			
			System.out.println();
			System.out.print("How many Burgers would you like? Enter 0 for none: ");
			QA = scan.nextInt();
			System.out.print("How many Drinks would you like? Enter 0 for none: ");
			QB = scan.nextInt();
			System.out.print("How many orders of Fries would you like? Enter 0 for none: ");
			QC = scan.nextInt();
			System.out.print("How many Desserts order would you like? Enter 0 for none: ");
			QD = scan.nextInt();
					
			subtotal = A * QA + B * QB + C * QC + D * QD;
			double TAX = TAX_RATE * subtotal;
			Total = subtotal + TAX + Delivery_Fee;
			
			System.out.println();
			System.out.println("Subtotal: " + fmt1.format(subtotal));
			System.out.println("Tax: " + fmt1.format(TAX) + " at " + fmt2.format(TAX_RATE));
			System.out.println("Delivery Fee: " + fmt1.format(Delivery_Fee));
			System.out.println();
			System.out.println("Total: " + fmt1.format(Total));
			
			
			
			
			}
			
			
			
			
			
			
		
		
		
		
		
	}
