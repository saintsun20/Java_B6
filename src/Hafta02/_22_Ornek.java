package Hafta02;

public class _22_Ornek {
    public static void main(String[] args) {
        String bagis1="700"; // String Kelime
        String bagis2="500"; // String Kelime

        System.out.println(bagis1+bagis2);

        // Ama ben bunları sayı olarak toplamak istiyorum
        // bu durumda String -> int e dönüştürmem lazım.
        int rakamBagis1= Integer.parseInt(bagis1); // Int.donusturInt("700");
        int rakamBagis2= Integer.parseInt(bagis2); // Parse: Düzenleyip,dönüştürmek demektir.

        int toplamBagis= rakamBagis1+rakamBagis2;
        System.out.println("toplamBagis = " + toplamBagis);

        //2.yol
        System.out.println(Integer.parseInt(bagis1)+Integer.parseInt(bagis2));




    }
}
