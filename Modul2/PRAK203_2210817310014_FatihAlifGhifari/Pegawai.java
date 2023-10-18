package Modul2.PRAK203_2210817310014_FatihAlifGhifari;

	//Pada Line ke-5 terjadi error, karena pada public class nya tidak sesuai dengan nama file java nya, jadi sesuaikan dengan nama file yang sudah ditentukan pada soal yaitu 'Pegawai'
	//public class Employee {
	public class Pegawai {
	    public String nama;
	    //Pada Line ke-9, property awal tidak memakai tipe data char, tetapi memakai tipe data String karena menyimpan berbagai karakter huruf (kata)
	    //public char asal;
	    public String asal;
	    public String jabatan;
	    public int umur;
	    public String getNama() {
	        return nama;
	    }
	    //Pada Line ke-16 akan terdapat error apabila property 'asal' masih bertipe data char, setelah tipe data property 'asal' menjadi String, baris ke-17 ini dapat dijalankan
	    public String getAsal() {
	        return asal;
	    }
	    //Pada baris ke-19 terdapat error karena belum ada pendeklarasian variabel j. Jadi lakukan pendeklarasian terlebih dahulu untuk variabel j.
	    //public void setJabatan() {
	    public void setJabatan(String j) {
	        this.jabatan = j;
	    }
}
