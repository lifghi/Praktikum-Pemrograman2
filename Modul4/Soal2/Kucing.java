package Soal2;

public class Kucing extends HewanPeliharaan {
    private final String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }
    public void displayDetailKucing() {
        super.display();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}

