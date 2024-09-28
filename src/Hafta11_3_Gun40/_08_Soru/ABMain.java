package Hafta11_3_Gun40._08_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println(A.mesaj); // A dan merhaba

        B b=new B(); // consructor çalıştı
        System.out.println(A.mesaj); // B den merhaba

        A a2=new A();
        System.out.println(A.mesaj); // B den merhaba
    }
}

// Bu kodun çıktısı nasıl olur

