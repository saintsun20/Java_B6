package Hafta11_4_OCA_I_Gun41;

public class S23 {
    public static void main(String[] args) {

        int[] stack = {10,20,30}; // 0,1,2 indexler
        int size=3;
        int idx=0;

//        // E şıkkı hatalı
//        while (idx <= size-1){  // idx <= 2
//            idx++;  // 3
//        }

        do{
            idx++;
        }while (idx<size-1);  // idx<2

        System.out.println("idx = " + idx);
        System.out.println("The Top elemen : " + stack[idx]); // 30 için 2 olmalı
    }
}
