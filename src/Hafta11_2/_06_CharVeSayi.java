package Hafta11_2;

public class _06_CharVeSayi {
    public static void main(String[] args) {

        char basHarf = 'A';
        int sayi = 65;
        char harf2 = (char)sayi;

        System.out.println("basHarf = " + basHarf); // A
        System.out.println("harf2 = " + harf2); // A

        for (int i = 0; i <= 255; i++) {
            char harf =(char)i;
            System.out.println(i+"harf = " + harf);
        }

        String kelime = "A"; // A+\n  bu 2 karakter
        char harf3 = 'A';    // A     bir karakter
    }
}
