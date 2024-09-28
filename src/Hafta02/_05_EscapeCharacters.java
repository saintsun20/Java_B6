package Hafta02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // \n alt satıra geç
        // \t tab tuşu
        // \b backspace 1 karakter geri siler



        System.out.println("Merhaba Dünya"); // MerhabaDünya
        System.out.println("Merhaba\nDünya"); // Merhaba alt satıra geçer Dünya
        System.out.println("Merhaba\tDünya"); // Merhaba   Dünya
        System.out.println("Merhaba\bDünya"); // MerhabDünya
        System.out.println("Merhaba \"Dünya\" "); // Merhaba "Dünya"
        System.out.println("Merhaba\\Dünya");  // Merhaba\Dünya
        System.out.println("Merhaba\rDünya");  // Dünya
    }
}
