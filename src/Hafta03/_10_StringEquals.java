package Hafta03;

public class _10_StringEquals {
    public static void main(String[] args) {
        // Equals : 1 stringi diğerine eşit mi sorar
        // sonuç boolean

        String s1="merhaba";
        String s2="Merhaba";

        boolean sonuc=s1.equals(s2); // s1 s2 ye  eşit Mi? true değilse false
        System.out.println("eşit Mi = " + sonuc); // false

        System.out.println("eşit Mi = " +s1.equals(s2)); // false
        System.out.println("esit Mi = " +s1.equals("merhaba")); // true


    }
}
