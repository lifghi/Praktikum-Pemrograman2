package Soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private final String nama, ras;

    public HewanPeliharaan() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        this.nama = in.nextLine();
        System.out.print("Ras: ");
        this.ras = in.nextLine();
    }
    public void display(){
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: "+nama);
        System.out.println("Dengan ras: "+ras);
    }
}

