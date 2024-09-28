package Hafta03;

public class _17_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase :  stringin büyük harf halini verir.

        String s1="merHaba Dünya";

        System.out.println("s1 = " + s1); // merHaba Dünya
        System.out.println("s1.toUpperCase() = " + s1.toUpperCase()); // MERHABA DÜNYA

        System.out.println("s1.startsWith(\"M\") = " + s1.startsWith("M")); // false
        System.out.println("s1.toUpperCase().startsWith(\"a\") = " + s1.toUpperCase().startsWith("M")); // true
    }
}
