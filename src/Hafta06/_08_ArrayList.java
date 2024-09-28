package Hafta06;

import java.util.ArrayList;

public class _08_ArrayList {
    public static void main(String[] args) {
        int sayi = 5;   // 1 tane sayı saklayabilen ve adı sayi olan hazfıza bölgesi
        int[] dizi = new int[5]; // 5 tane sayı tutabilen ve ismi dizi olan hafıza bölgesinin adı

        // dizilerde bütün kutular kullanılmazsa ne olur ? kalan hazfıza bölgesi atıl oluyor

        // Bana öyle dizi lazımki, ne kadar sayı eklersem o kadar artsın, silersem o kadar eksilsin
        // dizini kuzeni : Array in List hali diyeceğiz,
        // yani ekledikçe uzayan, sildikçe kısalan : ARRAYLIST
        // int,double,float,bollean -> Integer, Double, Float, Boolean

        ArrayList<Integer> list = new ArrayList<>(); // esnek dizi tanılandı, ekle artsın, sil kısalsın
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Burak"); // eleman ekleme
        isimler.add("Betül");
        isimler.add("Merve");
        isimler.add("Halil");

        System.out.println("isimler.size() = " + isimler.size());  // uzunluk length

        System.out.println("isimler = " + isimler); // otomatik yazdırma

        // araya ekleme
        isimler.add(1,"Erman");
        System.out.println("isimler = " + isimler);

        // verilen indexdeki elemanı değiştirme
        isimler.set(1,"Engin");
        System.out.println("isimler = " + isimler);

        // elemanlarda var mı kontrolü
        boolean varMi = isimler.contains("Betül");
        System.out.println("varMi = " + varMi);

        //eleman silme
        isimler.remove("Engin");
        System.out.println("isimler = " + isimler);

        // elamnın yerini öğrenme
        int indexEleman = isimler.indexOf("Merve"); // yok ise -1 gönderir
        System.out.println("indexEleman = " + indexEleman);

        // belirli indexdeki elemanı alma
        String ilkEleman = isimler.get(0);
        System.out.println("ilkEleman = " + ilkEleman);

        //bütün elemanları silme
        isimler.clear();
        System.out.println("isimler = " + isimler);

    }
}

