package Hafta08_3._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 1;
        cal1.name = "İsmet";
        cal1.surname = "Temur";
        // cal1.sifre = "1234"; // böyle
        // direk erişim istediği
        // sifreyi atayamaması lazım

        cal1.sifreAta("1234");
        cal1.sifreAta("Kuvvetli_Şifre1");

        cal1.sifreGoster();
    }
}
