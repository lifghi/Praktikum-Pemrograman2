package Modul2.PRAK203_2210817310014_FatihAlifGhifari;

public class Soal3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pegawai p1 = new Pegawai();
        //Pada baris ke-10 terdapat error karena kurangnya tanda titik koma (;) pada bagian akhir
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        //Pada baris ke-14 terdapat error karena pendeklarasian tidak sesuai dengan yang ada pada class Pegawai, jadi ditambahkan method setJabatan
        //p1.jabatan = "Assasin";
        p1.setJabatan ("Assasin");
        //Belum terdapat pendeklarasian pada property umur
        p1.umur = 17;

        //Pada baris ke-20, output yang diperlukan adalah "Nama: Roi", jadi kata Pegawai dihapus saja
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ke-25 kurang kalimat untuk mencetak kata tahun diakhir kalimat, jadi tambahkan (+ " tahun")
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");

	}

}
