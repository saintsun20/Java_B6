package Hafta03;

public class _07_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf : Baştan aramaya başlar, yine oda numarasını verir.
        // LastIndexOf : sondan aramaya başlar, yine oda numarasını verir.
        // oda numaraları, yani index hep aynıdır, arama yönüne göre DEĞİŞMEZ.

        //          111
        //0123456789012
        //Merhaba Dünya

        String cumle="Merhaba Dünya";
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.lastIndexOf(a) = " + cumle.lastIndexOf("a")); // 12
        System.out.println("cumle.lastIndexOf(y) = " + cumle.lastIndexOf("y")); // 11



    }
}
