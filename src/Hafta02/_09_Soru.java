package Hafta02;

public class _09_Soru {
    public static void main(String[] args) {

        int kenar=5; // Şeklinde verilen KARE bir tarlanın çevresini uzunluğunu yazdırınız.

        int cevre= kenar+kenar+kenar+kenar; // 4+kenar

        System.out.println("Çevre="+ cevre);

        //2.yol
        //System.out.println("Çevre="+(4+kenar));

        //3.yol
        System.out.println("Çevre="+(kenar+kenar+kenar+kenar));

        //4.yol
        System.out.println("Çevre="+(4*kenar));
    }
}
