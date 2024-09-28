package Hafta06;

public class _06_Metodlar_2 {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 15;
        int s4 = 56;

        int sonuc1 = toplamBul(s1,s2); // eğer param tip hep aynı ise
        int sonuc2 = toplamBul(s1,s2,s3); // sadece sayısı değişiyor ise
        int sonuc3 = toplamBul(s1,s2,s3,s4);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    public static int toplamBul(int ...dizi) // tipler aynı sadece sayısı değişik
    {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            toplam = toplam+dizi[i];

        return toplam;
    }

}


