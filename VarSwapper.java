public class VarSwapper 
	{
		public static void main(String[]argx) 
			{
				int a = 50;
				int b = 20;
			
			// int c = 0;
			//cetak isi var a dan b 
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("nilai var a dipindah ke b/ nilai var b dipindah ke var a");
							
			//proses pindah isi variabel
			System.out.println("nilai a = "+(a+b-a));
			System.out.println("nilai b = "+(b+a-b));
			}
	}