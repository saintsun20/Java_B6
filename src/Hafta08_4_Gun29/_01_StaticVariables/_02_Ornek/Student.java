package Hafta08_4_Gun29._01_StaticVariables._02_Ornek;

public class Student {
    int id = 0;
    String adSoyad;

    static int sayac = 1;
    // sen bitanesin,
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public Student(int id, String adSoyad) {
        this.id = id;
        this.adSoyad = adSoyad;
    } // maindeki ilk 4 satır için gerekli,
    // static değişkenden sonra gerek kalmadı


    public Student(String adSoyad) {
        this.adSoyad = adSoyad;
        this.id = sayac++; // ++sayac ; sayac=0 için
    }


    public String toString() {
        return "Student{" +
                "id=" + id +
                ", adSoyad='" + adSoyad + '\'' +
                '}';
    }
}
