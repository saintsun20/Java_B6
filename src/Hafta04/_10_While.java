package Hafta04;

public class _10_While {
    public static void main(String[] args) {
        // Ekrana 5 kes merhaba yazdırınız
        // 1- sayac=0
        // 2- "merhaba" yaz
        // 3- sayac = sayac + 1
        // 4- sayac <5 ise
        // 5- dur

        // döngünün içinde yani tekrarlanan hangi bölümler?
        // 2- "merhaba" yaz
        // 3- sayac = sayac +1

        // tekrar etme şartı
        // sayac < 5

        int sayac=0;
        while (sayac < 5 ) { // iken yap, sayac  < 5 iken yap
            System.out.println("merhaba");
            sayac = sayac + 1;
        }

        // parantezlerin arasını, şart sağlandığı sürece çalıştır.
    }
}
