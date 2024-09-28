package Hafta11_2;

public class _02_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        /****** StringBuilder ı biraz yakından tanıyalım *****/
        StringBuilder sb = new StringBuilder();
        sb.append("Bugün"); // kendine direk ekler, atamayı yapar
        sb.append(" hava");
        sb.append(" sıcak");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());

        sb.append(4); // eklenen değerleri otomatik stringe çevirip ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // Stringi tersine çevirir.
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // // (index)0 dahil , 5 hariç olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler.
        System.out.println("sb = " + sb);

        sb.insert(5, "kelime "); // // 5 nolu index e kelimeyi ekle : araya ekleme
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Bugün hava sıcak"); // String cumle = "Bugün hava sıcak";
        System.out.println("sb = " + sb);
        sb.replace(3,8,"Bu");
        System.out.println("sb = " + sb); // verilen aralığı bu stringle değiştir

        String strSb = sb.toString(); // butün string fonk kullanılabilir.

        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı, paralel çalıan yazılımlarda, StringBuffer kullanılır
        // örnek olarak oyunlarda aynı anda çıkan düşman savaşçı aynı anda ateş ediyor, alttada bir log olsa
        // yapılan işlemleri yazan string olarak bu durumda pararlel olan bu çalışmaya uygun sıralı birleştirme yapabilmesi lazım
        // işte bu gibi durumlarda kullanılır.

        /*String birleştirme işi bilgisayarda önemli

        Genelde aynı anda çalışan uygulamalarda var,
        mesala 10 kişi aynı oyunu oynuyor

        1.kişi şunu yaptı
        2.kişi şunu yaptı

        String birleştirme işini,madem paralel
        çalışan uygulamalar var hata vermesin
        diye paralel eklemeye uygun yazalım demişler.
        StringBuffer,

        programların büyük bölümü paralel çalışmıyor
        madem öyle,
        StringBuilder yapmışlar

         */
    }
}
