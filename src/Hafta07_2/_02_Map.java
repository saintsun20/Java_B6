package Hafta07_2;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {

        HashMap<Integer, String> hm=new HashMap<>();

        hm.put(1001, "Ummuhan");
        hm.put(1002, "Yusuf");
        hm.put(2001, "Şaban");
        hm.put(5001, "Polat");
        hm.put(1002, "Halil");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        System.out.println("keyler");
        for( Integer k  :hm.keySet() )
            System.out.println("k = " + k);

        System.out.println("value ler");
        for( String  v:hm.values() )
            System.out.println("v = " + v);

        System.out.println("key ve value birlikte");
        for(Map.Entry<Integer,String>  kv: hm.entrySet() )
            System.out.println(kv.getKey()+" "+kv.getValue());

    }
}
