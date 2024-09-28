package Hafta11_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // toplamMiktar kaç ay taksit => taksit dökümü, ödeme planı
        // Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        // yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.
        // Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        // Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek

        // toplam miktar, başlangıç Tarihi, kaç taksit bilgilerini almalıyım kullanıcıdan
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Taksit Miktarını alalım
        System.out.print("Toplam Tutar = ");
        int toplamTutar = okuInt.nextInt();

        // Taksit Başlangıç tarihini alalım
        System.out.print("Taksit Baş.Tarihi (12.08.2024) = ");
        String strTarih = okuStr.nextLine();
        LocalDate takBasTar = LocalDate.parse(strTarih, f);

        // Taksit Sayısını alalım
        System.out.print("Taksit Sayısı = ");
        int takSayisi = okuInt.nextInt();

        // 1 taksiti bul
        int aylikTaksit = toplamTutar / takSayisi;

        // Birdöngü ile taksit sayısı kadar ekrana ödeme planını yazdır.
        // hangi döngü ? fori
        System.out.println("Taksit No\tTaksit Tarihi\tTaksit Tutarı");
        for (int i = 1; i < takSayisi +1; i++) {
            System.out.print(i + ". Taksit \t");
            System.out.print(takBasTar.plusMonths(i).format(f) + "\t\t");
            System.out.println(aylikTaksit + "₺");
        }

        System.out.println("Taksit No\tTaksit Tarihi\tTaksit Tutarı");
        for (int i = 1; i <= takSayisi; i++) {
            System.out.print(i+".Taksit\t");
            System.out.print(takBasTar.plusMonths(i).format(f)+"\t\t");
            System.out.println(aylikTaksit +" ₺");
        }
    }
}
