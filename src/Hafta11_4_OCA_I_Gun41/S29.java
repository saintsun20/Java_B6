package Hafta11_4_OCA_I_Gun41;

public class S29 {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};  // indexler: 0,1,2,3,4 -> 135 değerlerinin indexleri : 0,2,4,

//        for(int e=1; e<=5 ; e+=1)
//            System.out.print(a[e]); // 2,3,4,5 outofboundException

        for(int e=0; e<5 ; e+=2)  // 0,2,4
            System.out.print(a[e]); // 1,3,5


        //  a[1] -> 2
    }
}
