package Hafta07_4_Gun25._02_Ornek;

public class CompanyMain {
    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Bulent";
        cal1.surname="Kılınç";
        cal1.age=25;

        Person cal2=new Person();
        cal2.name="Merve";
        cal2.surname="Kaya";
        cal2.age=20;

        // 1.Yöntem
        System.out.println("Adı="+cal1.name);
        System.out.println("Soyadı="+cal1.surname);
        System.out.println("Yaş="+cal1.age);

        System.out.println("Adı="+cal2.name);
        System.out.println("Soyadı="+cal2.surname);
        System.out.println("Yaş="+cal2.age);

        //2.Yöntem
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.Yöntem en güzel yöntem
        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

        cal1.getBirthYear();
        cal2.getBirthYear();
    }

    public static void BilgiYazdir(Person cal){
        System.out.println("Adı="+cal.name);
        System.out.println("Soyadı="+cal.surname);
        System.out.println("Yaş="+cal.age);

    }
}
