package Hafta02;

public class _23_Soru {
    public static void main(String[] args) {
        // String olarak verilen 3 notun ("82.5","95.5","56")
        // ortalamasını (ondalıklı) bulunuz

        String not1="82.5";
        String not2="95.5";
        String not3="56";

        double rakamNot1=Double.parseDouble(not1); // ctrl+d ile kolay kopyalama
        double rakamNot2=Double.parseDouble(not2);
        double rakamNot3=Double.parseDouble(not3);

        double ort = ( rakamNot1 + rakamNot2 + rakamNot3)/ 3;
        int ortInt = (int)ort; // ortalama int istenseydi

        System.out.println("ort = " + ort);
        System.out.println("ortInt = " + ortInt);



    }
}
