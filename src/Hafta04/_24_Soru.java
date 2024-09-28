package Hafta04;

import java.util.Scanner;

public class _24_Soru {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bölüm 2 : çarpımın sonucu 10000 i geçtiğinde işlem sonlansın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sınırı Giriniz = ");
        int sinir = oku.nextInt();

        int carpim = 1;
        for (int i = 1; i <= sinir; i++) { // Başı belli, sonu belli, artışı belli ise FOR döngüsü
            carpim = carpim*i;

            if (carpim > 10000)
               // System.out.println("i = " + i);
                break;
        }

        System.out.println("carpim = " + carpim);

    }
}
// Kaç kere döneceği belli değil ise WHILE
//a) Önce şart kontrolü var ise WHILE
//b) Şart sonra kontrolü sonra ise DO_WHILE
// %80 for, %18 While, %2 do_While
// for ( int i = 0; i < 10; i++)
//{
//  if(şart)
//     break; çalıştığında döngü sonlanır
//}
// int i = 0;
// while( i < 10){
//
// i++;
// }