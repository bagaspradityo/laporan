import java.io.*;
public class TiketPesawat {
public static void main(String[]argx) throws IOException {

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));


//deklarasi array 2 dimensi
String pemesan[][] = new String [3][4];
double tot [][] = new double [3][2];
double harga = 0;
int pil=0;


	
		do 
		{	
			System.out.println("=============================================");
			System.out.println("\t Tiket Reservation System \t");
			System.out.println("\t INDOTIKET AIRWAYS \t");
			System.out.println("\t JLN. DOMAIN 32, JAKARTA PUSAT \t");
			System.out.println("=============================================");
			System.out.println("1. input data pemesanan tiket : ");
			System.out.println("2. Lihat data Pemesanan : ");
			System.out.println("3. keluar ");
			System.out.println(" Masukkan no. pilihan menu anda (1-3) :");
			pil = Integer.parseInt(br.readLine());
			
			switch (pil)
			{
			
				case 1:
				System.out.println();
				System.out.println("====================================");
				System.out.println("\t Input Data Nilai Mahasiswa \t");
				System.out.println("====================================");	
					for (int i=0; i<pemesan.length; i++)
					{
						System.out.println(i+1);
						System.out.println("Nama :");
						pemesan[i][0] = br.readLine();
						System.out.println("Alamat :");
						pemesan[i][1] = br.readLine();
						System.out.println("telpon : ");
						pemesan [i][2] = br.readLine();
						System.out.println("Tujuan Keberangkatan :");
						pemesan[i][3] = br.readLine();
						System.out.println("Jumlah Tiket yang Dipesan :");
						tot[i][1] = Double.parseDouble(br.readLine());
					}
					break;
					
				case 2:
				System.out.println();
				System.out.println("====================================");
				System.out.println("\t Lihat Data Pemesanan \t");
				System.out.println("====================================");	
					for (int i = 0; i<3; i++)
						{
						if(pemesan[i][3].equalsIgnoreCase("Surabaya")) 
							{
								harga=350000;
							}
						else if (pemesan[i][3].equalsIgnoreCase("Denpasar"))
							{ 
								harga=700000;
							}
						else if (pemesan[i][3].equalsIgnoreCase("Yogyakarta"))
							{ 
								harga=300000;
							}
						else if (pemesan[i][3].equalsIgnoreCase("Balikpapan"))
							{ 
								harga=1000000;
							}
						else 
						{
							System.out.println("Maaf untuk sementara kami tidak melayani rute tujuan tersebut.");	
						}
						
						tot[i][0]=tot[i][1]*harga;
						
							
							System.out.println(i+1);
							System.out.println("Nama Pemesan :" + pemesan[i][0]);
							System.out.println("Alamat Pemesan :" + pemesan[i][1]);
							System.out.println("Telpon :" + pemesan[i][2]);
							System.out.println("Tujuan Keberangkatan :" + pemesan[i][3]);
							System.out.println("Jumlah Tiket yang dipesan :" + pemesan[i][1]);
							System.out.println("total harga (Rp.) :" + tot[i][0]);
							System.out.println();
							
						}
						break;
					
						default: break;
						}
					
						}
						while(pil<3);
						}
					}
			
					
						
					