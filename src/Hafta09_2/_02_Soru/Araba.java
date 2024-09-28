package Hafta09_2._02_Soru;

public class Araba {
    private String renk;
    private  int uretimYili;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    public Araba(String renk, int uretimYili, double motorHacmi, int kapiSayisi) {
//        this.renk = renk;
//        this.uretimYili = uretimYili;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;

        setRenk(renk);
        setKapiSayisi(kapiSayisi);
        setUretimYili(uretimYili);
        setMotorHacmi(motorHacmi);
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi <= 7 )
            this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Hatalı kapı sayısı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }



    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", uretimYili=" + uretimYili +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}

