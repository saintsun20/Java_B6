package Hafta04;

public class _28_Soru {
    public static void main(String[] args) {
        //Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        // *****
        // *****
        // *****
        // *****
        // *****

        // sout("*")
        // iç içe 1 den fazla döngüye : NestedLoop

        for (int satir = 0; satir < 5; satir++){

            for (int i = 0; i < 5; i++)
                System.out.print("*"); // 5 tane yan yana yaz

            System.out.println(); // yazdıktan sonra satır atla


        }
    }
}
