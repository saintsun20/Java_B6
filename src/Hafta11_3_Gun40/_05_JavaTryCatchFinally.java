package Hafta11_3_Gun40;

public class _05_JavaTryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime="";

        long startTime=System.currentTimeMillis();

        try {
            System.out.println("Hatadan önceki kısım");
            char harf = kelime.charAt(3);
            System.out.println("Hatadan sonraki kısım");
        }
        catch(Exception ex)
        {
            System.out.println("Hata olduğund açalışan kısım");
        }
        finally  // hata olsa da olmasada en son çalışan kısım
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("burası herzaman çalışan kısım");
        }

        System.out.println("diğer devam eden kodlar");
        System.out.println("Program bitti");
    }
}
