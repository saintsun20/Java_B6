package Hafta12_2_OCA_III_Gun43;

//Soru:52
public class MarkList {

    int num;

    public static void graceMarks(MarkList obj4) {  // fonksiyondaki adı obj4 ama obj1 ve obj2 dir
        obj4.num += 10;                              //fonksiyona nesnenin kendisi gider, aynı dizi gibi
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();  // bir tane nesne var
        MarkList obj2 = obj1;  // obj2 -> obj1 in nesnesini refere ediyor, ayrı yeni bir nesne yok
        MarkList obj3 = null;  // nesne yani değer hanesi henüz oluşmamış

        obj2.num = 60;
        graceMarks(obj2);
    }
}
