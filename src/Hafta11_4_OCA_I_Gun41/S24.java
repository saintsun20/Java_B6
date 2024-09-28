package Hafta11_4_OCA_I_Gun41;

public class S24 {
    public static void main(String[] args) {

        String[] strs=new String[2];  // null null

        // String ifadelerin dizilerinde default değer NULL
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

        int idx=0;

        for(String s: strs) {  // concat var olan hafızadaki yerine, bilgi ekle
            strs[idx].concat(" element " + idx); // null.concat  olamaz
            idx++;
        }

        for(idx=0; idx< strs.length ; idx++){
            System.out.print(strs[idx]);
        }
    }
}
