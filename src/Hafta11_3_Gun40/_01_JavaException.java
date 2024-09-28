package Hafta11_3_Gun40;

public class _01_JavaException {
    public static void main(String[] args) {

        // Except : Beklenmeyen, hatalı durum, istisna

        System.out.println("Program burada çalışmaya başladı");

        String kelime="";
        char harf=kelime.charAt(3); // hatayı burda verecek

        System.out.println("Program bitti");
    }
}

// program daha çalışmadan orataya çıkan hatalar :
// insanın yazdığını -> Makinanın anlayacağı dile çeviriyor: Derleme
// Compile Etme işlemi yapılamayınca COMPILE ERROR, Syntax Error

// program çalışmaya başladıktan sonra oluşan hatalar Exception(hata)
// üretir. Çalışma Zamanı hataları RUN TIME ERROR yani exception ları
// denir.

