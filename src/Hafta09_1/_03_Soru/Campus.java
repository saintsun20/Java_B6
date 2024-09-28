package Hafta09_1._03_Soru;

public class Campus {
    public static void main(String[] args) {
        User u1 = new User("İsmet", Role.PERSONEL, Statu.AKTIF);
        User u2 = new User("Ebuzer", Role.ADMIN, Statu.AKTIF);
        User u3 = new User("Ummuhan", Role.SATIS, Statu.AKTIF);

        User.userSil(u1);   // İsmet silindi
        User.userSil(u2);   // Admin silinemez
        User.userSil(u3);   // Ummuhan silindi

        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
        System.out.println("u3 = " + u3);
    }
}
