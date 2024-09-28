package Hafta03;

public class _23_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı kriter(regex) verilebiliyor.
        //regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : regex olarak neler yazılabiliyor google dan araştırılacak!

        String s1="Merhaba12 Dünya23";

        System.out.println("s1 = " + s1);
        System.out.println("s1.replaceAll(\"[nab]\",\"_\") = " + s1.replaceAll("[nab]","_")); // a yi b yi ve n yi _ ile değiştiri.
        System.out.println("s1.replaceAll(\"[123]\",\"\") = " + s1.replaceAll("[123]","")); // 1,2 ve 3 sil
        System.out.println("rakamları -> sil = " + s1.replaceAll("[0-9]","")); // rakamları sil
        System.out.println("rakamların dışındakileri -> sil = " + s1.replaceAll("[^0-9]","")); // ^ : dışındakileri demek
        System.out.println("a-z aralığını -> sil = " + s1.replaceAll("[a-z]",""));
        System.out.println("A-Z aralığını -> sil = " + s1.replaceAll("[A-Z]",""));

       // System.out.println("harfleri -> sil = " + s1.replaceAll("[A-Z]","").replaceAll("[a-z]"));
    }
}
