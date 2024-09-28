package Hafta08_1._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    void dersEkle(Lesson ders)
    {
        int varOlanToplamSaat = 0;
        for(Lesson d: this.dersleri)
            varOlanToplamSaat += d.saat;

        // yeni eklenecek ders ile max saati aşıyormu?
        // aşmıyorsa ekleyeceğim.
        if(varOlanToplamSaat + ders.saat < this.maxSaat) {
            this.dersleri.add(ders);
            System.out.println(ders.name + "Eklendi");
        }
        else
            System.out.println("Alabileceğiniz Max Saati Aştınız!");
    }

    static void universiteKurallari() {
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız");
    }
}
