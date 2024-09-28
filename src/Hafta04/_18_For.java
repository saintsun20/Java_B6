package Hafta04;

public class _18_For {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        int sayac=1;
        while (sayac <= 5)
        {
            System.out.println(sayac);
            sayac++;
        }

        // Java yı yazan abiler, ablalar demişler ki
        // bir döngünün başlangıcı belli, son bitişi belli ve ortışı belli
        // ise DAHA KOLAYI var
        for (sayac = 1; sayac <= 5; sayac++) // başlangıcı belli, şartı belli, artışı belli
        {
            System.out.println(sayac);
        }

        // Döngü Kuralı :
        // bir döngünün kaç kere döneceği belli ise : FOR
        // bir döngünün kaç kere döneceği belli DEĞİL ise : WHILE
        // while durumunda Kontrol SONDA ise : DO_WHILE

    }
}
