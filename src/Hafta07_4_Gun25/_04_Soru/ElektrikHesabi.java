package Hafta07_4_Gun25._04_Soru;

public class ElektrikHesabi {
    double birimFiyat = 20;
    int toplamTuketim = 0;

    void tuketimEkle(int tuketim)
    {
        this.toplamTuketim += tuketim;
    }

    void ToplamTuketimYaz(){
        System.out.println("Toplam Tük = " + this.toplamTuketim);
    }

    void FaturaYaz(){

        System.out.println("***     Faturanız     ***");
        System.out.println("Toplam Ücret = " + this.toplamTuketim*birimFiyat);
    }
    }

