package Hafta03;

public class _18_StringContains {
    public static void main(String[] args) {
        // contains : aranan harfler stringin içinde var mı yok mu onu verir.
        // boolean cinsinden sonucu verir.
        
        String s1="Merhaba Dünya";
        
        boolean varMi=s1.contains("a"); // true
        System.out.println("varMi = " + varMi);

        System.out.println("s1.contains(\"a\") = " + s1.contains("a")); // 2.Yöntem true
        System.out.println("s1.contains(\"ya\") = " + s1.contains("ya")); // true
        System.out.println("s1.contains(\"z\") = " + s1.contains("z")); // false
        System.out.println("s1.contains(\"aü\") = " + s1.contains("aü")); // false
        System.out.println("s1.contains(\"A\") = " + s1.contains("A")); //false


    }
}
