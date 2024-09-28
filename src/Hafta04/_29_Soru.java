package Hafta04;

public class _29_Soru {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yalnızca 1 yıldız ile yapınız

        for (int satir = 1; satir <= 5; satir ++){

            for (int i = 1; i <= satir; i ++)  // satır her döngüde 1 artacak
                System.out.print("*");

            System.out.println();
        }
    }
}
