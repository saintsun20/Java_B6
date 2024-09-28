package Hafta11_1;

import java.time.LocalDate;

public class _06_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun = LocalDate.now();
        LocalDate dun   = buGun.minusDays(1); // dün

        System.out.println("dun = " + dun);

        boolean sonraMi = buGun.isAfter(dun); // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi = buGun.isBefore(dun); // bugün dünden önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi = buGun.isEqual(dun); // bugün dün e eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYil = buGun.isLeapYear();
        // bugün yılı artık yıl mı, yani Şubat 29 gün mü
        System.out.println("artikYil = " + artikYil);
    }
}
