package Hafta03;

public class _04_StringCharAt {
    public static void main(String[] args) {
        // charAt(Index): istenen noktadaki karakteri verir.
        //          111
        // 0123456789012  : index (0 dan başlayan oda no), uzunluk : 13
        // Merhaba Dünya
        String cumle="Merhaba Dünya";
        System.out.println("cumle.length() = " + cumle.length()); // 13
        int uzunluk=cumle.length(); // 13

        char ilkHarf=cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        char sonHarf=cumle.charAt( uzunluk-1); //son harf
        System.out.println("sonHarf = " + sonHarf);

    }
}
