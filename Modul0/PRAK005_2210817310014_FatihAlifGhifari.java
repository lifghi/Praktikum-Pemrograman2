package Modul0;
import java.util.Scanner;
public class PRAK005_2210817310014_FatihAlifGhifari {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit : ");
        String mkn = input.nextLine();
        System.out.print("Masukkan hobi : ");
        String ho = input.nextLine();
        System.out.print("Aku Suka Makan "+mkn +", dan Hobiku "+ho);
        input.close();
	}
}
