package Hafta03;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(fullName) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)
        // mesela İsmet Temur -> İsmet i ayrı yazdırın, Temur u ayrı yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("Ad ve Soyad = ");
        String adSoyad=oku.nextLine();

        int boslukIndex = adSoyad.indexOf(" "); // boşluğun olduğu yerin INDEX
        
        String ad= adSoyad.substring(0,boslukIndex); // Aziz
        String soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);








    }
}
