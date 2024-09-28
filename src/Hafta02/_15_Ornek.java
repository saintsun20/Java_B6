package Hafta02;

public class _15_Ornek {
    public static void main(String[] args) {
        // kişinin kilosunu (kg) ve boyunu (cm) kendiniz veriniz.
        // kilo ve boy küsüratlı mesela 65.4, 1.65m gibi
        // ekrana kilonuz=......... ve  boyunuz:.......... yazdıktan sonra
        // vücut kitle indeksini bulunuz. kilo/(boy*boy)

        double boy = 1.98;
        double kilo = 98.5;

        double kitleIndex = kilo / (boy * boy);


        System.out.println("kilonuz = " + kilo);
        System.out.println("boyunuz = " + boy);
        System.out.println("kitleIndex = " + kitleIndex);

        //2.yol
        System.out.println(" kitleIndex = " + (kilo / (boy * boy)));


    }
}
