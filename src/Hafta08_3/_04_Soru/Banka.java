package Hafta08_3._04_Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.musteriNo = 100111;
        mus1.ad = "İsmet";
        mus1.soyad = "Temur";

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraÇek(50);

        System.out.println(mus1.musteriHesap.bakiyeGoster());
    }
}
