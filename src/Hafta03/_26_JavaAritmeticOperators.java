package Hafta03;

public class _26_JavaAritmeticOperators {
    public static void main(String[] args) {

        int toplam=0;
        int sayac=1;

        toplam=toplam+sayac; // toplam=1, sayac=1
        sayac=sayac+1;       // toplam=1, sayac=2

        toplam= toplam + sayac++; // yukarıdaki 2 satırın dengi
        // sayacı toplama ekle, daha sonra yani işlemden sonra sayacı 1 artır.

        /*************************************/

        toplam=0; sayac=1;

        sayac=sayac+1;      // toplam=0, sayac=2
        toplam=toplam+sayac;// sayac=2, toplam=2

        toplam=toplam + ++sayac; // bu yukarıdaki 2 satırın dengi
        // işlemden ÖNCE sayacı artır, sonra işlemi yap

        //Özet
        // ++ sonra ise, önce işlem, sonra artış
        // ++ önce ise, önce artış, sonra işlem



    }
}
