package Hafta04;

import java.util.Scanner;

public class _17_Do_While_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan H girilene kadar ekrana "Program Devam Ediyor" yazan
        // ve H girildiğinde ise "Program Bitti" yazıp. programdan çıkılsın.

        // tekrar edecek kısım : kelime iste ve ekrana yaz
        // döngünün şartı : cevap != "H", cevap == "E"

        // while mı do_While mı ? önce işlem sonra kontrol olduğundan Do_While
        Scanner oku = new Scanner(System.in);
        String cevap = "";

        do {
            System.out.print("Devam Mı = "); cevap = oku.next(); /*cevap = oku.next();*/ // E,e
            /*if (cevap.equalsIgnoreCase("E"))*/ /*if(cevap_E ise)*/
                /*System.out.println("Program Devam Ediyor"); */
            System.out.println("Program Devam Ediyor");
        }while (cevap.equalsIgnoreCase("E")); /*(cevap != "H");*/

        System.out.println("Program Bitti");

    }
}
// equalsIgnoreCase : büyük veya küçük kabul ediyor
// Döngüleri %80 yeni göreceğimiz, %18 while, %2 do_While