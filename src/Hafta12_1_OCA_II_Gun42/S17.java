package Hafta12_1_OCA_II_Gun42;

public class S17 {
    public static void main(String[] args) {

        int[][] arr= new int[2][4];

        arr[0] = new int[]{1,3,5,7};  // 0.Satır yeniden boyutlandırıldı ve değer atandı
        arr[1] = new int[]{1,3};      // 1.Satır yeniden boyutlandırıldı ve değer atandı

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for(int[] satir  : arr)
            for(int eleman : satir)
                System.out.print(eleman);
    }
}
