package Hafta07_4_Gun25._02_Ornek;

public class Person {
    //özellikle
    String name;
    String surname;
    int age;

    //metodları,davranışları
    void bilgiYazdir() {
        //this : kendi
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.age);
    }

    void getBirthYear() {
        System.out.println("Doğum Yılı=" +
                (2024 - this.age));
    }
}
