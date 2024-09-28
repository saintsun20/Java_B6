package Hafta12_1_OCA_II_Gun42;

public class S64 {
    public static void main(String[] args) {


        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " "); //A

            if (arr[i].equals("C")) { // A C ye eşit değil, 1.adımda çalışmadı
                continue;
            }

            System.out.println("Work Done");  // Work Done
            break; // içinde bulunduğu döngüyü kırar
        }
    }
}
