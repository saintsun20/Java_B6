package Hafta05;

import java.util.Scanner;

public class _06_Split {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz
        // Bugün hava çok güzel -> boşluk sayısı +1 kaç kelime olduğunu verir
        Scanner oku = new Scanner(System.in);

        System.out.print("Cümle = ");
        String cumle = oku.nextLine();

        //1.yöntem
        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                boslukSayisi++;
        }
        System.out.println("boslukSayisi = " + boslukSayisi);

        //2.yöntem
        String[] kelimeler = cumle.split(" "); // split : cümleyi boşluğa göre parçala

        System.out.println("kelimeler.length = " + kelimeler.length);
        System.out.println("kelimeler[0] = " + kelimeler[0]);
        System.out.println("kelimeler[1] = " + kelimeler[1]);
        System.out.println("kelimeler[2] = " + kelimeler[2]);
        System.out.println("kelimeler[3] = " + kelimeler[3]);

        for(int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
//Harfleri tersten yazdırma
//for(int i=cumle.length-1; i>0; i--)
//    sout(cumle.charAt(i))
//
//Kelimeleri tersten yazdırma
//for(int i=kelimeler.length-1; i>0; i--)
//    sout(kelimeler[i])