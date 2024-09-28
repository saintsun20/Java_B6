package Hafta09_2._01_EnCapsulation;

public class ToplulukMain {
    public static void main(String[] args) {
        Kisi k1 = new Kisi();
        k1.ad = "İsmet";
        k1.soyad = "Temur";
        // k1.yas = -2;

        k1.yasAta(-2);
        k1.yasAta(40);

        // yani değerler nesneye atanırken
        // kontrolden geçmeli doğru DATA için

        System.out.println(k1.yasVer());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme
        // ve alma
        // işlemine EnCapsulation denir.
    }
}
