package Hafta11_2;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bugün"; // + Stringlerde ekleme, birleştirme işlemi yapıyor
        cumle = cumle + " hava";
        cumle = cumle + " sıcak";

        System.out.println(cumle); // Bugün hava sıcak
        System.out.println(cumle + " ve nemli"); // cumle değişmedi ekrana yazılan değişti
        // kendisine atanmaz ise son hali geçerlidir.

        System.out.println("***********************************");
        cumle.concat(" ve nemli"); // concat birleşik halini verir
        // atama yok ise cumle değişmez
        System.out.println(cumle.concat(" ve nemli")); // System.out.println(cumle + " ve nemli");
        System.out.println(cumle);

        System.out.println("***********************************");
        cumle = cumle.concat(" ve nemli"); // birleşik hali kendine atanırsa cumle değişir
        System.out.println(cumle);

        System.out.println("***** String Builder *****");

        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugün"); // hem ekler hem kendine atar, kendine direk ekliyor
        cumle2.append(" hava");
        cumle2.append(" sıcak");

        System.out.println(cumle2);

        // + , concat , Stringbuilder
        // Performans testi sonucu :

        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        long startTime=System.currentTimeMillis();

        String test1 ="";
        for (int i = 0; i < 30000; i++)
            test1 = test1+ " merhaba";

        long fark=System.currentTimeMillis()-startTime;
        System.out.println("+ için geçen süre ="+fark);

        startTime=System.currentTimeMillis();

        String test2="";
        for (int i = 0; i < 30000; i++)
            test2 = test2.concat(" merhaba");

        fark=System.currentTimeMillis()-startTime;
        System.out.println("concat için geçen süre ="+fark);


        startTime=System.currentTimeMillis();

        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 30000; i++)
            test3.append(" merhaba");

        fark=System.currentTimeMillis()-startTime;
        System.out.println("StringBuilder için geçen süre ="+fark);
        }
    }

