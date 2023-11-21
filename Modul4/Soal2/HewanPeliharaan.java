package Soal2;

public abstract class HewanPeliharaan {
    private final String nama, ras;

    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharan: " + nama);
        System.out.println("Ras: " + ras);
    }
}

