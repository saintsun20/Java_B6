package Hafta12_1_OCA_II_Gun42;

public class S164 {
    public static void main(String[] args) {

        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for(int e: data)
        {
            if ( e != key){
                continue;
//                count++; // bu kodun hiç çalışma şansı var mı,
//                         // bu durumda program hiç çalışmaz
//                         // hiç çalışma şansı olmayan kodu yazamazsın
            }
        }

        System.out.println(count+" Found");
    }
}

// Compile ERROR , ulaşılamaz kod, count++ , continue dan hemen sonra olduğu için, hiç çalışmaz


