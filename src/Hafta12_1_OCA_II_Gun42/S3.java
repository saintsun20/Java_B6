package Hafta12_1_OCA_II_Gun42;

public class S3 {
    public static void main(String[] args) {

        int num[][]=new int[1][3];  // satir Index: 0, sutun Index 0,1,2

        // değer atama
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length ; j++) {
                num[i][j]=10;  // 0,0   0,1    02
            }

        }

        // yazdırma
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length ; j++) {
                System.out.println(i+","+j+"="+num[i][j] );  // 0,0   0,1    02
            }

        }
    }
}
