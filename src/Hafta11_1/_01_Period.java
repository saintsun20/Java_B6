package Hafta11_1;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    public static void main(String[] args) {
        // Period : 2 tarih arasındaki farkı tutar.
        // Sadece LocalDate lerde kullanılır

        LocalDate dogumTarihi1 = LocalDate.of(1982, 11, 22);
        LocalDate dogumTarihi2 = LocalDate.of(1982, 04, 23);
        LocalDate bugün = LocalDate.now();

        Period fark1 = Period.between(dogumTarihi1, bugün);
        Period fark2 = Period.between(dogumTarihi2, bugün);
        System.out.println("fark1 = " + fark1);
        System.out.println("fark2 = " + fark2);
        System.out.println("fark1.getYears() = " + fark1.getYears());
        System.out.println("fark2.getYears() = " + fark2.getYears());
        System.out.println("fark1.getMonths() = " + fark1.getMonths());
        System.out.println("fark2.getMonths() = " + fark2.getMonths());
        System.out.println("fark1.getDays() = " + fark1.getDays());
        System.out.println("fark2.getDays() = " + fark2.getDays());

        System.out.println("Yaşınız = " + fark1.getYears() + " Yaşındasınız ");
        System.out.println("Yaşınız = " + fark2.getYears() + " Yaşındasınız ");

        System.out.println("**********************************");

        Period period3Gun = Period.ofDays(3); // 3 günlük zaman dilimi
        Period period3Ay  = Period.ofMonths(3); // 3 Aylık zaman dilimi

        System.out.println("**********************************");
        LocalDate kursBaslangic = LocalDate.of(2024, 6, 3);
        Period kursSuresi       = Period.ofMonths(6);
        LocalDate kursBitis     = kursBaslangic.plus(kursSuresi); // minus -, plus +
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());


    }
}
