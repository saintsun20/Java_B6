package Hafta06;

import java.util.Iterator;
import java.util.TreeSet;

public class _18_Sets_IV {
    public static void main(String[] args) {
        TreeSet<String> renkler=new TreeSet<>();

        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        System.out.println("renkler = " + renkler); // renkler = [Blue, Green, RED, Red]

        // foreach -> for each
        for (String uye : renkler ) // renkler in içindeki elemanları alıp tek tek gönder
            System.out.println("uye = " + uye);

        int[] dizi={45,6,7,44,56};
        for(int e : dizi)
            System.out.println("e = " + e);

        // İç Sırası garanti
        Iterator gosterge= renkler.iterator(); // renkler isimli SET in başına gösterge oluşturuldu
        while (gosterge.hasNext())  // sırada eleman var mı ?
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // sıradaki elemanı Next ile alıp yazdırıyoruz,
        }

    }
}
