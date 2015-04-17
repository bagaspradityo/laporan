public class BonusBarang{
	public static void main(String[]args){
		int jmlBarang = 30;
		int bonus = jmlBarang/2;
		int jmlBarangPlusBonus = jmlBarang + bonus;
		int harga = 25000*jmlBarang;
		
		
		System.out.println("Jumlah Barang = "+jmlBarang);
		System.out.println("Bonus Barang = "+bonus);
		System.out.println("Jumlah Barang +bonus = "+jmlBarangPlusBonus);
		System.out.println("Total Bayar = Rp"+harga);
		
	}
}