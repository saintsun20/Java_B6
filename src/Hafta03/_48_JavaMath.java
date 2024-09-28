package Hafta03;

public class _48_JavaMath {
    public static void main(String[] args) {
        int a=12;
        int b=4;

        //2 değer için geçerli
        System.out.println("a ve b den büyük olanı ver =" + Math.max(a,b));
        System.out.println("a ve b den küçük olanı ver =" + Math.min(a,b));
        System.out.println("2 nin 3 kuvveti =" + Math.pow(2,3)); // 8
        System.out.println("b nin karekökü =" + Math.sqrt(b)); // 2
        System.out.println("round yuvarlama 3.1 =" + Math.round(3.1)); // 3  --  5 e kadar alta
        System.out.println("round yuvarlama 3.5 =" + Math.round(3.5)); // 4  --  5 ve üstü yukarı

        System.out.println("ceil 3.1 =" + Math.ceil(3.1)); // 4 , bu rakamdan büyük en yakın tam sayı // tavan
        System.out.println("ceil 3.5 =" + Math.ceil(3.5)); // 4 , bu rakamdan büyük en yakın tam sayı // tavan

        System.out.println("floor 3.1 =" + Math.floor(3.1)); // 3 , bu rakamdan küçük en yakın tam sayı // taban
        System.out.println("floor 3.5 =" + Math.floor(3.5)); // 3 , bu rakamdan küçük en yakın tam sayı // taban



    }
}
