package Hafta11_2;

import java.util.Arrays;

public class _04_VeriTipleriMetodda {
    public static void main(String[] args) {

        // ilkel tip için metod nasıl çalışıyor
        int sayi = 5;
        sayiArttir(sayi); // ilkel tiplerde değer gider metoda
        System.out.println("sayi = " + sayi);

        // referans tip için nasıl çalılıyor
        int[] dizi1 = {1,2,3};
        diziSifirla(dizi1);
        System.out.println("dizi1 " + Arrays.toString(dizi1));

    }

    public static void sayiArttir(int a) {
        // buraya gelen sayi mı, değeri mi? DEĞERİ geldi
        a = a + 1;
    }

    public static void diziSifirla(int[] dizi2) { // referansı geldi
        // dizi2 = dizi1 gibi oldu
        dizi2[0] = 0;
        dizi2[1] = 0;
        dizi2[2] = 0;
    }
}
