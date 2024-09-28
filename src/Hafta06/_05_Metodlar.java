package Hafta06;

public class _05_Metodlar {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 45;

        String ad = "İsmet";
        String soyad = "Temur";

        int sonuc1 = toplamBul(s1,s2);  // metdolarda aynı isimler kullanılabilir
        int sonuc2 = toplamBul(s1,s2,s3);   // yeterki ayırt edici bir nokta olsun
        String sonuc3 = toplamBul(ad,soyad);  // parametre sayısı veya tipi
    }

    public static int toplamBul(int s1,int s2){
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2, int s3){
        return s1+s2+s3;
    }

    public static String toplamBul(String ad, String soyad){
        return ad+" "+soyad;
    }
    }

