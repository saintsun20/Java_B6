package Hafta02;

public class _24_Soru {
    public static void main(String[] args) {
        String tamAd="İsmet Temur";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi=true;

        String tumu= tamAd + sinifNo + subesi + gectiMi;
        // birleştirmeye soldan sağa doğru giderim
        // solda string varsa yanındaki otomatik stringe dönüştürüm yani eklerim
        System.out.println("tumu = " + tumu);

        int bagis1=700;
        String strBagis1= String.valueOf(700);
        System.out.println("strBagis1 = " + strBagis1);

        System.out.println("merhaba"+1+2); // merhaba12
        System.out.println(1+2+"merhaba"); // 3merhaba
        //Java da stringin yanına + ile ne gelirse otomatik string olur.

    }
}
