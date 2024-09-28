package Hafta07_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(9,"Tilki");
        hm.put(2,"Kedi");
        hm.put(30,"Köpek");
        hm.put(11,"Kuş");
        hm.put(4,"Kurt");

        System.out.println("hm = " + hm);

        LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(9,"Tilki");
        lhm.put(2,"Kedi");
        lhm.put(30,"Köpek");
        lhm.put(11,"Kuş");
        lhm.put(4,"Kurt");

        System.out.println("lhm = " + lhm);

        TreeMap<Integer, String> tm=new TreeMap<>();
        tm.put(9,"Tilki");
        tm.put(2,"Kedi");
        tm.put(30,"Köpek");
        tm.put(11,"Kuş");
        tm.put(4,"Kurt");

        System.out.println("tm = " + tm);

    }
}
