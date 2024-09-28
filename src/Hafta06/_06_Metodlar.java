package Hafta06;

public class _06_Metodlar {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 15;
        int s4 = 56;

        int sonuc1 = toplamBul(s1,s2); // eğer param tip hep aynı ise sadece sayısı değişiyor ise
        int sonuc2 = toplamBul(s1,s2,s3);
        int sonuc3 = toplamBul(s1,s2,s3,s4);
    }

    public static int toplamBul(int s1,int s2){ return s1+s2;}
    public static int toplamBul(int s1,int s2, int s3){ return s1+s2+s3;}
    public static int toplamBul(int s1,int s2, int s3, int s4){ return s1+s2+s3+s4;}
}

