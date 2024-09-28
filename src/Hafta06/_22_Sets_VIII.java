package Hafta06;

import java.util.HashSet;

public class _22_Sets_VIII {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        // birleştirme
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        // Farkını Bulma
        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);
        System.out.println("farki = " + farki);

        // Kesişim Bulma
        HashSet<Integer> kesisim=new HashSet<>();
        kesisim.addAll(setA);
        kesisim.retainAll(setB);
        System.out.println("kesisim = " + kesisim);

    }
}
