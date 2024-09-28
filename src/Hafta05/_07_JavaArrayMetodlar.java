package Hafta05;

import java.util.Arrays;

public class _07_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] isimler = {"Ahmet","Zeynep","Roman","Cihan"};

        // diziyi direk yazdırmak
        System.out.println("İsimler = " + Arrays.toString(isimler));

        // diziyi sıralamak
        Arrays.sort(isimler); // sıralandı a-z, 1-9
        System.out.println("İsimler = " + Arrays.toString(isimler));

        int[] a={55,67,4,3,12};
        Arrays.sort(a);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("a min = " + a[0]);
        System.out.println("a max = " + a[a.length-1]);

        // Elemanları tek bir rakam ile doldurmak
        Arrays.fill(a,5); // a dizisini 5 ile doldur
        System.out.println("a = " + Arrays.toString(a));


    }
}
