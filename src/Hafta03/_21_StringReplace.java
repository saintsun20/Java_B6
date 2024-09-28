package Hafta03;

public class _21_StringReplace {
    public static void main(String[] args) {
        // replace : bir stringin içindeki karakter/ler verilenle değiştirir
        // hepsini dönüştürür.
        
        String s1="Merhaba Dünya";
        System.out.println("s1 = " + s1);

        System.out.println("s1.replace(\"a\",\"e\") = " + s1.replace("a","e")); // Merhebe Dünye
        System.out.println("s1.replace(\"a\",\"\") = " + s1.replace("a","")); // Mrhb Düny
        System.out.println("s1.replace(\"ba\",\"de\") = " + s1.replace("ba","de")); // Merhade Dünya
        System.out.println("s1.replace(\"a\",\"aaa\") = " + s1.replace("a","aaa")); // Merhaaabaaa Dünyaaa
        System.out.println("s1.replace(\"a\",\"***\") = " + s1.replace("a","***")); // Merh***b*** Düny***
        System.out.println("s1.replace(\"a\",\"e\").replace(\"b\",\"c\") = " + s1.replace("a","e").replace("b","c")); // Merhace Dünya
    }
}
