package Hafta06;

import java.util.ArrayList;

public class _13_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam saklayabilen değişken
        int[] dizi=new int[10]; // 10 rakam saklayabilen değişken, tek boyutlu
        int[][] tablo=new int[2][5];  // 2 satırlık, 5 elemanlı, toplamda 10 elemanlı 2 satırx5 sütun

        ArrayList<Integer> liste=new ArrayList<>(); // tek boyutlu, ucu açık, esnek

        // bir sınıfta 3 ders var ve her derste farklı miktarda not var
        // ArrayList in 2 boyutlusu lazım, Listeleri Listesi lazım

        ArrayList<Integer> matNotlar=new ArrayList<>(); // ayrı list
        ArrayList<Integer> fizNotlar=new ArrayList<>(); // ayrı list
        ArrayList<Integer> kimNotlar=new ArrayList<>(); // ayrı list

        matNotlar.add(50);
        matNotlar.add(60);
        matNotlar.add(70);

        fizNotlar.add(20);
        fizNotlar.add(30);

        kimNotlar.add(40);
        kimNotlar.add(50);
        kimNotlar.add(60);
        kimNotlar.add(70);

        ArrayList<  ArrayList<Integer>   > notlarListeleri=new ArrayList<>();
        notlarListeleri.add(matNotlar);
        notlarListeleri.add(fizNotlar);
        notlarListeleri.add(kimNotlar);

        notlarListeleri.get(0);  // matNotlar bir liste verir
        notlarListeleri.get(0).get(0);  // matematik dersinin ilk notu
        notlarListeleri.get(0).add(85); // Matematik dersinin listesine 85 notu eklendi.

        for (int i = 0; i < notlarListeleri.size(); i++) { //listelerin sayısı  tablo.length

            for (int j = 0; j < notlarListeleri.get(i).size(); j++) {  // ilgili listenin size, tablo[i].length
                System.out.print(notlarListeleri.get(i).get(j)+"\t");  // tablo[i][j]
            }

            System.out.println();
        }
    }
}
