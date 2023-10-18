package Modul2.PRAK202_2210817310014_FatihAlifGhifari;

public class Soal2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kopi kopi1 = new Kopi();
        kopi1.namaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.harga = 25000;

        kopi1.info();
        kopi1.setPembeli("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
    }

}
