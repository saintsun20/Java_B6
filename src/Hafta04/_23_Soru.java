package Hafta04;

public class _23_Soru {
    public static void main(String[] args) {
        // 1 ila 100(dahil) arasındaki ÇİFT sayıların toplamını bulup yazdırınız.
        // b) Fakat toplamın değeri 1000 i geçtiğinde dursun.

        int toplam = 0;
        for (int i = 2; i <= 100 ; i+=2) {
            toplam = toplam+i;

            if (toplam > 1000)
                break; // çalıştığında içinde bulunduğu döngüyü kırar.
        }

        System.out.println("toplam = " + toplam);

    }
}
