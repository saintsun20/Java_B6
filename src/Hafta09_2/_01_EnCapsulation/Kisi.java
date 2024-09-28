package Hafta09_2._01_EnCapsulation;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    public void yasAta(int yas) {
        if (yas > 0 && yas < 150)
            this.yas = yas;
        else
            System.out.println("Hatalı Yaş");
    }
    public int yasVer() { return this.yas; }
}
