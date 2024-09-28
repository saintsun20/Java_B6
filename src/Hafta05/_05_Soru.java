package Hafta05;

public class _05_Soru {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald, atv, fox, habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[] tvler = {"trt","kanald","fox","habertürk","ntv"};

        int randomIndex = (int)(Math.random()*5); // 0,1,2,3,4

        System.out.println("Seçilen Kanal = " + tvler[randomIndex]);
    }
}
//String tvler=new String[5];
//tvler[0]="trt";
//tvler[1]="fox";
//tvler[2]="habertürk";
//tvler[3]="ntv";
//tvler[4]="kanald"