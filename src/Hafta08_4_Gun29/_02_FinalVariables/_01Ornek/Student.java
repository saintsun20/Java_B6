package Hafta08_4_Gun29._02_FinalVariables._01Ornek;

public class Student {
    private final int id;
    // final değişkenlere, ya tanımlandığında yada
    // constructor da değer atanabilir
    // ve sonra değiştirilemez

    String adSoyad;

    private static int sayac = 1;

    public Student(String adSoyad) {
        this.adSoyad = adSoyad;
        this.id = sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", adSoyad='" + adSoyad + '\'' +
                '}';
    }

    void kimlikYaz() {

    }
        // this.id = 8;  final değişkenlere sonradan
        // değer atanamaz

}
