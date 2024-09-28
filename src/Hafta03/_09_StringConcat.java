package Hafta03;

public class _09_StringConcat {
    public static void main(String[] args) {
        // concat : bir sitringi diğerine birleştirir.

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birleşik hali = " + s1+s2); // MerhabaDünya
        System.out.println("birleşik hali = " + s1.concat(s2)); // birleşik hali MerhabaDünya
        System.out.println("birleşik hali = " + s1.concat(" ").concat(s2)); // Merhaba Dünya
        System.out.println("birleşik hali = " + s1.concat(" " + s2)); // Merhaba Dünya

        System.out.println("s1 = " + s1); // s1 in değeri değişmedi
        System.out.println("s2 = " + s2); // s1 nin değeri değişmedi

        // +        : yavaş (2 veya 3 birleştirme için uygun)
        // concat   : hızlı (15 birleştirmeden fazla işlemlerde uygun)

    }
}
