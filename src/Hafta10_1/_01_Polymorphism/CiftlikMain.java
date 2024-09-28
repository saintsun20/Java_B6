package Hafta10_1._01_Polymorphism;

import java.util.*;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("Karabaş");
        kopek1.ses(); // Havladı
        kopek1.kokladi(); // Kokladı

        Kedi kedi1 = new Kedi("Köpük");
        kedi1.ses(); // Miyavladı
        kedi1.tirmaladi(); // Tırmaladı

        System.out.println("-----------------");
        kopekSesi(kopek1); // Havladı
        kediSesi(kedi1); // Miyavladı

        System.out.println("-----------------");
        hayvanSesi(kopek1); // Havladı
        hayvanSesi(kedi1); // Miyavladı
        // hem kendi türünde hem de extend olduğu tür
        // de de olabilmesine çok biçimlilik yani
        // POLYMORPHISM denir

        // Eşitliğin solundaki genel adı, sağındaki özel adı
        // Referans Tipi     // Nesne Tipi
        Hayvan hay1 = new Hayvan("Kurbağa");
        Hayvan kopek2 = new Kopek("Kangal"); // Hayvan kılığında köpek
        Hayvan kedi2 = new Kedi("Boncuk"); // Hayvan kılığında kedi
        kopek2.ses(); // sadece bulunduğu kılığındaki metodları geçerli
        kedi2.ses(); // sadece bulunduğu kılığındaki metodları geçerli
        ((Kopek)kopek2).kokladi();

        HashMap<String,String> hm1 = new HashMap<>();
        HashSet<String> hs1 = new HashSet<>();
        ArrayList<String> list1 = new ArrayList<>();

        Map<String,String> hm2 = new HashMap<>(); // Maplerden HashMap
        List<String> list2 = new ArrayList<>(); // Listelerden ArrayList
        Set<String> hs2 = new HashSet<>(); // Setlerden HashSet
    }

    // kılık değiştirmeye : Polymorphism : Şizofren, Bipolar
    public static  void hayvanSesi(Hayvan h1)
    {
        h1.ses(); // yani nesnenin metodu değil türün ortak metodunu kullanıyoruz

        // h1 aslında sen kopeksen, köpeğe dönüş ve kokla
        if (h1 instanceof  Kopek) // kopekten geldiysen
            ((Kopek)h1).kokladi();

        if (h1 instanceof  Kedi) // Kedi den geldiysen
            ((Kedi)h1).tirmaladi();
    }// faydası : ortak yerden miras alanlara ORTAK METODLAR yazılabilir

    public  static void kopekSesi(Kopek k1)
    {
        k1.ses();
    }

    public static void kediSesi(Kedi k1)
    {
        k1.ses();
    }
}










