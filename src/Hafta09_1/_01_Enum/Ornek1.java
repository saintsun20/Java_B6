package Hafta09_1._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay noya göre , ayın gün sayısını
        // veren programı yazınız

        int ayNo=5; //mayıs

        switch (ayNo){
            case 2: System.out.println(28); break;
            case 1:  // Ocak
            case 3:  // mart
            case 5:  // mayıs
            case 22:
            case 10:
            case 12: System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30); break;
        }

//        if (kullanıcının rolu == Rollerden.Ogrenci)  // ön tarafta yazılımda Ogrenci gözüksün arkada 2 olsun
//        {
//            sadece öğrencinin yapabildiklerini yapar
//        }
//        else
//            if (kullanıcnın rolu== Rollerden.Ogretmen)
//        {
//            sadece öğretmenin yapabildiklerini yapabilir
//        }

        Boolean sonuc=true;    //1
        sonuc=false;   //0

    }
}







