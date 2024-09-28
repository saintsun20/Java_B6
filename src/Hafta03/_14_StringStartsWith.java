package Hafta03;

public class _14_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith ("") : bunun la başlıyor mu?
        // boolean sonuç döndürür

        String s1="Manisa";

        System.out.println("s1.StartsWith(M) = " + s1.startsWith("M") ); // true
        System.out.println("s1.StartsWith(Man) = " + s1.startsWith("Man") ); // true
        System.out.println("s1.StartsWith(ni) = " + s1.startsWith("ni") ); // false
    }
}
