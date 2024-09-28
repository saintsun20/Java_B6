package Hafta05;

public class _17_Metodlar {
    public static void main(String[] args) {
        // () metod veya fonksiyon : çalışan bir kod bloğu
        // () içindeki değerlere parametre denir

        double randomSayi = Math.random();  // parametre almıyor, geriye değer döndürüyor.
        int max = Math.max(45,67);          // parametre alıyor, geriye değer döndürüyor.
        System.out.println();               // parametre almıyor, geriye değer döndürmüyor.

        System.out.println("Merhaba Dünya");// parametre alıyor, geriye değer döndürmüyor

        int rndSayi = (int)(Math.random()*10);// Metodlarım.RndSayiVer(100);
        // daha anlaşılır, daha az ve tekrar yazmaktan kurtaran yöntem

        _18_Metodlar.merhabaYaz(); // metodu her yerden çağırıp kullanabilirim.


    }
}
