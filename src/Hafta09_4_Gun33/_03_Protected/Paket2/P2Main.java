package Hafta09_4_Gun33._03_Protected.Paket2;

import Hafta09_4_Gun33._03_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h = new P1Hayvan();
        p1h.ad = "Kopuk";

        Kedi k = new Kedi();
        k.ad = "Beyaz Kedi";
    }
}
