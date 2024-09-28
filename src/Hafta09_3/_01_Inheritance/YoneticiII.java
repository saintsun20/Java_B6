package Hafta09_3._01_Inheritance;

public class YoneticiII {

    // extends : Personelin her şeyin al
    // extraları ekle, yani Miras AL
    // OOP2 = Inheritance

    // child class, miras alan, subclass, mirasyedi
    public class YeniYonetici extends Personel{

        public void zamYap()
        {
            System.out.println("Zam Yapıldı!");
        }
    }
}
