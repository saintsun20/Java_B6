package Hafta08_1._02_Ornek;

public class SoruMain {
    public static void main(String[] args) {

        int enb = Math.max(3,4);

        enb = MyTool.enbVer(3,4);
        int enk = MyTool.enkVer(3,4);
        double usSonuc = MyTool.usAl(3,4);
        double kareKokSonuc = MyTool.kareKokAL(4);

        System.out.println("KAreKokSonuc = " + kareKokSonuc);

    }
}
