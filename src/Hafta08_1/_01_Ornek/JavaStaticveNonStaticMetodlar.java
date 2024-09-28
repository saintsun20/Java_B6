package Hafta08_1._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.belgeYazdir(); // ogr1 NESNE
        // nesne ye bağlı (static yok)
        // metodun içindeki nesneye ait özellikler(field)
        // kullanılacaksa, yani içinde this le belirtilen
        // değişkenler kullanılacaksa STATIC YOK

        Ogrenci.belgeYazdirStatic();
        // static : zaten var, oluşturulmaya ihtyacı yok
        // yani nesnenin oluşturulmasına ihtiyaç yok
        // tipin adı ile direk kullanılabilir
        // içinde NESNE ye ait değişkenler kullanılmayacak
        // ise o zaman hızlı ve pratik kullanım için
        // ve programları her yerden direk çağırabilmek
        // için STATIC kelimesi eklenir.
        // Math.MAx() gibi kullanılacak toollar için
        // static kullanılır. STATIC metodların içinden
        // ANCAK direk olarak STATIC  metodları çağrılabilir
        // Bir diğer kullanım amacı: TİPİ ilgilendiren
        // metodlar içinde STATIC kullanılabilir.

        BenimFonk.rndSayiVer(  10);

    }

    public static void bilgiYazdir(){

    }
}
