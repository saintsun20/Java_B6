package Hafta06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _17_Sets_III {
    public static void main(String[] args) {
        // SETS : TEKRAR YOK
        // HashSet : hızlı, sıra yok
        // TreeSet : herzaman sıralı
        // LinkedHasSet : eklenme sırasına göre

        // Hızlı, hızlı olmak içinde kendine göre bir sırada tutar, sırasız
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);//hs = [dört, iki, bir, üç, beş]

        // Ekleme sırasına göre sıralı tutar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);//lhs = [bir, iki, üç, dört, beş]

        // Herzaman sıralı
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);//ts = [beş, bir, dört, iki, üç]

        // Herzaman sıralı
        TreeSet<Integer> tsSayilar=new TreeSet<>();
        tsSayilar.add(1);
        tsSayilar.add(5);
        tsSayilar.add(45);
        tsSayilar.add(3);
        tsSayilar.add(2);
        System.out.println("tsSayilar = " + tsSayilar);//

    }
}
