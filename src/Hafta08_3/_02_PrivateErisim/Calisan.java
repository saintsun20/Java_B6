package Hafta08_3._02_PrivateErisim;

public class Calisan {
    int id; // default: sadece kendi paketindekiler
    String name; // default
    String surname; // default
    private String sifre; // SADECE class ın içinden erişilebilir.

    // SET leme
    public void sifreAta(String sifre){
        if (sifre.length() >= 8)
            this.sifre = sifre;
        else
            System.out.println("Zayıf Şifre");
    }

    // GET leme
    public void sifreGoster() {
        System.out.println(this.sifre);
    }
}
