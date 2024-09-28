package Hafta06;

import java.util.ArrayList;

public class _15_Sets_I {
    public static void main(String[] args) {
        int sayi=5;
        int[] dizi=new int[10]; // sınırı sabit 1D, index var
        int[][] tablo=new int[3][5]; // sınırı sabit 2D, index var

        ArrayList<Integer> liste=new ArrayList<>(); // sınırı sabit değil, ekledikçe arta 1D, index var
        ArrayList< ArrayList<Integer>  > listeler=new ArrayList<>(); // sınırı sabit değil ekledikçe arta 2D, index var

        // Java cım şu ana kadar lazım olduğu durumda buna uygun değişkenleri aldım, teşekkür ederim.
        // fakat bana şöyle bir dizi lazım; verileri attığımda, aynı veriden tekrar gelirse EKLEMESİN,
        // tani tekrarlı elemanlar OLMASIN
        // 2.cisi
        // a) istersem, ne eklersem ekliyim, içindekileri herzaman sıralı tutsun, kendinden sortlu
        // b) istersem, eklenme sırasına göre tutsun
        // c) istersem, hızlı çalışması için ,istediğin sırada tut, yeterki en hızlı şekilde çalışssın

        // tek tek eleman eleman işlemler için değilde, işlem yapılacağı zaman, bütün elemanla işleme
        // alınmasına uygun olan bu toplu işlem dizisine SET denir.
        // a) TreeSET -> herzaman sıralı
        // b) LinkedHashSet -> eklenme sırasına göre tutar
        // c) HashSet -> hızlı çalışan modeli, iç sırasını kendi belirliyor
        // INDEX YOK

    }
}
