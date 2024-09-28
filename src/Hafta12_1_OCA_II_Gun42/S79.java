package Hafta12_1_OCA_II_Gun42;

public class S79 {
    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        for(int i=0; i < arr.length ; i++){

            System.out.print(arr[i]+" "); // A B C D

            if (arr[i].equals("D")){
                System.out.print("Work Done");   //Work Done
                break;
            }

            continue; // kendisinden sorna geleni pass geçrir, fakat burada sonrasınd azaten kod yok
            // continue sonraki adıma direk geçer
        }
    }
}
