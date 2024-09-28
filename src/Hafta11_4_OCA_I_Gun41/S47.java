package Hafta11_4_OCA_I_Gun41;

public class S47 {
    public static void main(String[] args) {

        String kelime = "Merhaba";
        kelime.concat(" dünya"); // görüntü olarak eklenmiş hali
        System.out.println("kelime = " + kelime);  // merhaba

        String[] strs={"A","B"};
        int idx=0;

        for(String s : strs){
            strs[idx].concat(" element "+idx); // hiç bir etkisi yok
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
