package Hafta12_2_OCA_III_Gun43;

public class S82 {
    public static void main(String[] args) {

        String[][] chs =new String[2][];  // 2 satır, sutun belirsiz  int[] dizi;
        chs[0] = new String[2]; // 0.satır kaç sutun oldu 2
        chs[1] = new String[5]; // 1.satır 5 sütun oldu
        int i = 97;

        //chs.length -> Satır sayısı
        for (int a=0; a< 2; a++) {    // 2
            for (int b = 0; b < 2; b++) { //2
                chs[a][b] = ""+i; // 00-> 97,01-> 98,10-> 99,11 -> 100,  12,13,14 kaldı-> null
                i++;
            }
        }
        for (String[] ca : chs){
            for (String c : ca){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
}
