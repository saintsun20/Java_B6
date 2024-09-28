package Hafta11_4_OCA_I_Gun41;

public class S21 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4}; // indexler : 0,1,2,3  değerler : 1,2,3,4

        int i=0;

        do {
            System.out.print(arr[i] + " "); // 1,2,3,4   array[4]
            i++;
        }while(i < arr.length + 1);  // i < 5
    }
}
