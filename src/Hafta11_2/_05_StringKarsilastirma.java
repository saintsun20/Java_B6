package Hafta11_2;

public class _05_StringKarsilastirma {
    public static void main(String[] args) {

        String kelime1 = new String("merhaba"); // scanner
        String kelime2 = new String("merhaba"); // scanner

        if (kelime1 == kelime2) // referansları aynı MI
            System.out.println("Eşit 1"); // referanslar aynı değil

        if (kelime1.equals(kelime2)) // değerleri aynı MI
            System.out.println("Eşit 2"); // Sadece Eşit 2 yazacak

        // Çünkü == REFERANSLARI karşılaştırır
        // equals ise DEĞERLERİ karşılaştırır.

        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır
    }
}
