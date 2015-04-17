import java.io.*;
public class ForDemo01
{
	public static void main(String[]argx) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int i;
		
		System.out.println("Masukkan Bilangan Ganjil : ");
		i=Integer.parseInt(br.readLine());
		for(i=0;i<30;i++)
		{
			if(i%2==1)
				{
					System.out.println(i);
				}
		}
	}
}