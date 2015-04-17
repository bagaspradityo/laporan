import java.io.*;

public class CheckBentukAir
	{
		public static void main(String[]argx) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Program Check Bentuk Air");
				System.out.println("Masukan Temperatur Air (C) = ");
				int suhu=Integer.parseInt(br.readLine());
				
				if(suhu<=0)
					{
						System.out.println("Air Menjadi padat");
					}
				else if (suhu >=100)
					{
						System.out.println("Air Menjadi Gas");
					}
				else 
					{
						System.out.println("Air Menjadi Beku");
					}
			}
	}