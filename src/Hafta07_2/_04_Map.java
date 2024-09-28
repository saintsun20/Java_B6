package Hafta07_2;

import java.util.TreeMap;

public class _04_Map {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız
        // isim, email, telefon, adres

        TreeMap<String,String> yusufKartvizit=new TreeMap<>();

        yusufKartvizit.put("isim","Yusuf Ucucu");
        yusufKartvizit.put("email","yusuf@gmail.com");
        yusufKartvizit.put("telefon","0505333333");
        yusufKartvizit.put("adres","Çekmeköy");

        System.out.println("yusufKartvizit.get(isim) = " + yusufKartvizit.get("isim"));
        System.out.println("yusufKartvizit.get(email) = " + yusufKartvizit.get("email"));


        TreeMap<String,String> ummuhanKartvizit=new TreeMap<>();

        ummuhanKartvizit.put("isim","Ümmühan Teke");
        ummuhanKartvizit.put("email","ummuhan@gmail.com");
        ummuhanKartvizit.put("telefon","050554444");
        ummuhanKartvizit.put("adres","Üsküdar");

        System.out.println("ummuhanKartvizit.get(isim) = " + ummuhanKartvizit.get("isim"));
        System.out.println("ummuhanKartvizit.get(email) = " + ummuhanKartvizit.get("email"));

        // Kartvizitlerin Map i yani listeklerin listesi gibi
        TreeMap<String,       TreeMap<String,String>      >  kartvizitler=new TreeMap<>();

        kartvizitler.put("yusuf", yusufKartvizit);
        kartvizitler.put("ummuhan", ummuhanKartvizit);

        System.out.println("Yusuf un telefonu="+ kartvizitler.get("yusuf").get("telefon"));
        System.out.println("Ümmühan ın emaili="+ kartvizitler.get("ummuhan").get("email"));

    }
}
