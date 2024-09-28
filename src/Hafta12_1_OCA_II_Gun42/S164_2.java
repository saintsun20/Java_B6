package Hafta12_1_OCA_II_Gun42;

public class S164_2 {
    public static void main(String[] args) {

        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for(int e: data)
        {
            if ( e != key){ // e != 2014   Çalıştığı değerler: 2010, 2013, 2015, çalışmdığı değerler: 2014,2014
                continue; // çalıştığında kendinden gelenleri pass geçirir, sonraki adımdan devam eder
            }

            count++;  // burası hangi değerlerde çalışır: 2014 ve 2014 de
        }

        System.out.println(count+" Found");
    }
}

//1.Adım    e 2010  bu değer için count++ ÇALIŞAMADI
//2.Adım    e 2013  bu değer için count++ ÇALIŞAMADI
//3.Adım 2014 continue ÇALIŞAMADI,  dolayısyla count++ çalışabildi 1 oldu
//4.Adım 2015 değer için continue ÇALIŞTI, count++ çalışamadı
//5.Adım 2014 değeri için continue ÇALIŞAMADI, count++ çalıştı ve 2 oldu

