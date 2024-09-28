package Hafta11_3_Gun40;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

        Scanner oku=new Scanner(System.in);
        //Hata nın oluşma ihtimal böglesi TRY bölgesi, hata olur ise catch ile yakala
        try { // olay yeri: hata verme , mesajımı devreye al
            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt(); // hata olduğunda CATCH e git

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt(); // hata olduğunda CATCH e git

            int bolum = sayi1 / sayi2; // hata olduğunda CATCH e git
            System.out.println("bolum = " + bolum);
        }
        catch(Exception hata)
        {
            System.out.println("Hata oldu");
            System.out.println(hata);
        }

        System.out.println("Program bitti");
    }
}

