package Hafta12_2_OCA_III_Gun43;

public class S18 {
    public static void main(String[] args) {

        String[][] chs = new String[5][2]; // 5 satır 2 sutun
        chs[0] = new String[2]; // 2 sutun  -> burada 2.satırı yeniledi
        chs[1] = new String[5]; // 5 sutun  -> burada ise 2 hane olan sutun sayısını 5 e çıkardı
        // chs[2],chs[3],chs[4] -> 2 null

        int i = 97;

        for (int a = 0; a < chs.length; a++) { //chs.length -> 5 dir.
            for (int b = 0; b < chs.length; b++)
                chs[a][b] = "" + i;  // en fazla 0 ve 1 olabilir, 4 olamaz  chs[0][2]
            i++;
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
