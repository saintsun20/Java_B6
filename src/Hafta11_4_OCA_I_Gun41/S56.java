package Hafta11_4_OCA_I_Gun41;

public class S56 {
    public static void main(String[] args) {

        String names[] ={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {

            for (String n : names) {   // Thomas,Peter,Joseph
                pwd[idx] = n.substring(2, 6); // 2,5 dahil parça alıyor, omas
                System.out.println(pwd[idx]); // omas yazıldı
                idx++;
            }

        }
        catch(Exception e)
        {
            System.out.println("Invalid Name");
        }
    }
}
