package Hafta08_4_Gun29._04_Soru;

public class Vatandas {
    String isim;
    String adres;
    private final int TCNo;

    private static int TCNoSayac = 1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TCNo = TCNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", TCNo=" + TCNo +
                '}';
    }
}
