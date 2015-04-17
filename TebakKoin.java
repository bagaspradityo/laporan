import java.util.*;

public class TebakKoin 
	{
		public static void main(String[]argx)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("PROGRAM TEBAK ANGKA/GAMBAR");
				System.out.println("Masukan Tebakan Anda :");
				System.out.println("1. Angka");
				System.out.println("2. Gambar");
				int tebakanUser = sc.nextInt();''''
				
				System.out.println("Anda Menebak = ");
				if(tebakanUser==1)
					System.out.println("Angka");
				else
					System.out.println("Gambar");
				
				int pcOut = (int)(Math.random()+0.5);
				System.out.println("Komputer Mengeluarkan");
				if(pcOut==1)
					System.out.println("Angka");
				else
					System.out.println("Gambar");
					
				if(tebakanUser==pcOut)
					System.out.println("Selamat Anda Benar");
				else
					System.out.println("Selamat Anda Salah");				
			}
	
	}