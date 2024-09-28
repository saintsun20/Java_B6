package Hafta09_4_Gun33._03_Protected.Paket2;

import Hafta09_4_Gun33._03_Protected.Paket1.P1Hayvan;

public class Kedi extends P1Hayvan {

    public Kedi() {
        super.cinsi ="Kara Kedi"; // protectedlara
        // extend yapan classların içinden de erişilebilir.

    }
}
