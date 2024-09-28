package Hafta02;

public class _17_JavaChar {
    public static void main(String[] args) {
        // char aslında arka planda sayıdır.

        char basHarf='A'; // A -> 65, Karakterler tek tırnak arasında gösterilir.

        // çünkü  " " bu String demek, ' ' ise karakter demek.

        System.out.println("basHarf = " + basHarf);

        char adIlkHarf='İ'; // İsmet in İ si
        char soyadIlkHarf ='T'; // Temur un T si

        System.out.println(adIlkHarf+"."+soyadIlkHarf+"."); // İ.T.
    }
}
