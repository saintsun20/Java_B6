package Hafta06;

import java.util.ArrayList;
import java.util.Scanner;

public class _14_Soru {
    public static void main(String[] args) {
        // Bir canlı sözlük yapılmak isteniyor,
        // Kullanıcıdan kelime ve manası şeklinde
        // Devam ietmek istediği kadar bilgi alınız
        // 2 bilgi alınız.
        // Daha sonra kullanıcıdan bir kelime alarak
        // manasını yazdırınız.


        // kelimelein olduğu bir liste, manalarının olduğu bir liste
        ArrayList<String> kelimeler=new ArrayList<>();
        ArrayList<String> manalar=new ArrayList<>();

        ArrayList< ArrayList<String>   >  sozluk=new ArrayList<>();
        sozluk.add(kelimeler);
        sozluk.add(manalar);

        Scanner oku=new Scanner(System.in);
        String cevap="";
        do{
            //kelimeyi al
            System.out.print("Kelime="); String kelime=oku.nextLine();
            kelimeler.add(kelime); //sozluk.get(0).add(kelime);

            //manasını al
            System.out.print("Manası="); String mana=oku.nextLine();
            manalar.add(mana); //sozluk.get(1).add(mana);

            //devammı diye sor
            System.out.print("Devam ? (E/H)");
            cevap=oku.nextLine();

        }while(cevap.equalsIgnoreCase("E"));

        // aranacak kelimeyi al, mansaını bul yaz
        System.out.print("Manasını istediğiniz kelime=");
        String arananKelime=oku.nextLine();

        //1.Yol
        int arananKelimeIndex=kelimeler.indexOf(arananKelime);
        System.out.println(manalar.get(arananKelimeIndex));

        //2.Yol
        for (int i = 0; i < kelimeler.size(); i++) {

            if (kelimeler.get(i).equalsIgnoreCase(arananKelime))
                System.out.println(manalar.get(i));
        }

    }
}
