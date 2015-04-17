import java.io.*;
public class DoWhileDemo2 
{
	public static void main(String[]argx) throws IOException
	{
		boolean selesai=false;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int angka = 0;
		int total = 0;
		
		do
		{
			System.out.print("Masukkan angka [999=exit] :");
			angka = Integer.parseInt(br.readLine());
			if(angka==-1)
				selesai=true;
			else
				total += angka;
		}
			while(!selesai);
			System.out.println("Total = "+total);
	}
}