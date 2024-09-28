package Hafta12_2_OCA_III_Gun43;

public class S71 {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        System.out.println(arr.length);  // satır sayısıydı : 2
        System.out.println(arr[0].length); // 4
        System.out.println(arr[1].length); // 2

        for (int[] a : arr) { // ilk Adım a:  1, 3, 5, 7 ,  sonraki Adım:1, 3

            for (int i = 0; i < arr.length; i++) {   //1,3
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}
