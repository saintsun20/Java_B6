package Hafta03;

public class _15_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith ("") : verilen karakter/ler ile bitiyor mu?
        // boolean olarak sonucu döndürür.

        String s1="Manisa";

        System.out.println("s1.endsWith(sa) = " + s1.endsWith("sa")); // true
        System.out.println("s1.endsWith(a) = " + s1.endsWith("a")); // true
        System.out.println("s1.endsWith(s) = " + s1.endsWith("s")); // false

    }
}
