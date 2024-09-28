package Hafta06;

import java.util.HashSet;

public class _19_Sets_V {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        System.out.println("hs = " + hs);

        hs.remove(5); // index zaten yok o yüzden eleman değerine siler
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        if (hs.contains(7)) // eleman var mı kontrolü
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear(); // bütün elemanları boşaltma , toplu silme
        System.out.println("hs = " + hs);

    }
}
