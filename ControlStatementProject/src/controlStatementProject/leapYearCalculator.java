package controlStatementProject;

import java.util.Scanner;

public class leapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	
	public static void input() {
		try (Scanner baca = new Scanner (System.in)) {
			int tanggal, bulan, tahun;
			String name = null;
			
			System.out.print("Masukkan Bulan (1-12) = ");
			bulan = baca.nextInt();
			
			System.out.print("Masukkan Tahun = ");
			tahun = baca.nextInt();
			
			System.out.println("\nHasil : ");
			String ganjilgenap = (bulan % 2 == 0) ? "genap" : "ganjil";
				
				switch (bulan) {
				case 1 :
					name = "Januari";
					tanggal = 31;
					break;
				case 2 :
					name = "Feruari";
					tanggal = 28;
					break;
				case 3 :
					name = "Maret";
					tanggal = 31;
					break;
				case 4 :
					name = "April";
					tanggal = 30;
					break;
				case 5 :
					name = "Mei";
					tanggal = 31;
					break;
				case 6 :
					name = "Juni";
					tanggal = 30;
					break;
				case 7 :
					name = "Juli";
					tanggal = 31;
					break;
				case 8 : 
					name = "Agustus";
					tanggal = 31;
					break;
				case 9 :
					name = "September";
					tanggal = 30;
					break;
				case 10 :
					name = "Oktober";
					tanggal = 31;
					break;
				case 11 :
					name = "November";
					tanggal = 30;
					break;
				case 12 :
					name = "Desember";
					tanggal = 31;
					break;
				default :
					tanggal = 0;
					System.out.println("Bulan tidak ada!!!");
					break;
				}
			
			if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
				System.out.println("Merupakan Tahun Kabisat");
				if (tanggal == 28) {
					tanggal = 29;
				}
			}
			
			else {
				System.out.println("Bukan Tahun Kabisat!!!");
			}
			
			System.out.println("Nomor Bulan "+ganjilgenap);
			System.out.println("Bulan "+name+" memiliki "+ tanggal+" hari");		
		}
	}
}