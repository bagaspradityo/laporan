import java.util.*;

public class CobaIf
	{
		public static void main(String[]argx) 
			{
				Scanner input = new Scanner(System.in);
				double sale, taxes, total;
				
				final double tax_rate = 0.08; 
				final double shipping_fee = 5.00;
				
				System.out.println("Enter the item price");
				sale = input.nextDouble();
				taxes = sale*tax_rate;
				total = sale + taxes;
				System.out.println("Sale : $"+sale);
				System.out.println("Tax : $"+taxes);
				
				if (sale < 25.00)
				{
					total += shipping_fee;
					System.out.println("Shipping is $5.00");
				}
				System.out.println("Final cost : $"+total);
			}
	}