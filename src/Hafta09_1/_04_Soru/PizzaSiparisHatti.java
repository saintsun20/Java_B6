package Hafta09_1._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<PizzaSize> siparisler = new ArrayList<>();

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim){
                case 1: siparisler.add(PizzaSize.SMALL);break;
                case 2: siparisler.add(PizzaSize.MEDIUM);break;
                case 3: siparisler.add(PizzaSize.LARGE);break;
                case 4: siparisGoster(siparisler);
            }

        } while (secim <= 4);

    }
    public static void siparisGoster(ArrayList<PizzaSize> sip)
    {
        int s = 0, m = 0, l = 0;
        for (PizzaSize p: sip)
            switch (p){
                case SMALL : s++; break;
                case MEDIUM: m++; break;
                case LARGE: l++; break;
            }

        System.out.println("Siparişleriniz");
        if (s > 0) System.out.println("Small Pizzadan "+s+" adet");
        if (m > 0) System.out.println("Medium Pizzadan "+m+" adet");
        if (l > 0) System.out.println("Large Pizzadan "+l+" adet");
    }
    public static void menu()
    {
        System.out.println("********* Pizza Menü ********");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al - Sipariş Göster");
        System.out.println("5 - Çıkış");
    }
}

