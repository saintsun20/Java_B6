package Hafta12_2_OCA_III_Gun43;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2); // points.remove(1);
        points.add(3);
        points.add(4);
        points.add(null);

        System.out.println("points = " + points);
        points.remove(1);  // index 1 deki değeri mi siler , yoksa değer 1 i yani index 0 ı mı siler
        System.out.println("points = " + points);

        points.remove(null); // bu sayı olmadığı için , ne kabul etti ? NULL olarak değeri sildi

        System.out.println("points = " + points);
        //points.remove((Object)1); // değer olarak 1 i siler

        // değer silerken aynı değerden 2 tane var ise ilkini siler.
        // points.clear(); hepsini siler

        // points.remove((Object)1); // değer olarak 1 siler
        // System.out.println("points = " + points);
        // sadece rakam verirsen onu index kabul eder ve ona göre silerim
        // Object yani değer verirsen , değer silerim

        // points.remove((Object)7); // deger olarak siler, değeri bulamazsa hata vermez
        // points.remove(1); // rakam ise önce indexe bakar
        // points.remove(7); olmayan indexi silme işleminde hata verir
    }
}
