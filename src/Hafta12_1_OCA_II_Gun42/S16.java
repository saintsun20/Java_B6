package Hafta12_1_OCA_II_Gun42;

public class S16 {
    public static void main(String[] args) {

        int cnt=0;
        String[][] arr = {
                {"A", "B", "C"},   // 0.satır
                {"D", "E"}         // 1.satır
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j].equals("B")) {
                    continue;  // çalışsa da etkisiz
                }
            }
            continue; //Dış for un continue , bu da çalıştığınd azaten etkisiz
        }
    }
}
