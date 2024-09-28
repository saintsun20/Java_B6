package Hafta12_1_OCA_II_Gun42;

public class S114 {
    public static void main(String[] args) {

        int[] dizi;  // int sayi;
        dizi=new int[3];  // sayi=5

        int dizi2[];
        dizi2=new int[5];

        int[] dizi3=new int[5];
        int dizi4[]=new int[6];

        //********************************

        int numbers[];  //referansı var yani ismi, ama veri kutusu yok
        numbers=new int[2];  // veri kutusu var , pointer ı var ama için default değerler var, 0,0
        numbers[0]=10;  // 10,0
        numbers[1]=20;  // 10,20

        numbers = new int[4]; // HAFIZADAKİ YERİNİ YENİLEYİP, 4 haneye çıkarıyor, 0,0,0,0
        numbers[2]=30; // 0,0,30,0
        numbers[3]=40; // 0,0,30,40

        for (int x:numbers){
            System.out.print(" "+x);
        }

        // Stringlerde default değer NULL, int lerde 0, boolean false,

    }
}
