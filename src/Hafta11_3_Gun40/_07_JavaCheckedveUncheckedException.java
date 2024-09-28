package Hafta11_3_Gun40;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        String kelime="";

        //try-catch almak senin kararın ise buna UNCHECKED Exception denir
        try
        {
            char harf = kelime.charAt(3); // try-catch e ister al ister alma sana kalmış
        }
        catch (Exception ex)
        {
            System.out.println("hata oluştu");
        }

        //Java nın zorunlu try catch tuttuğu kodlara CHECKED Exception denir
        try
        {
            Thread.sleep(1000); // 1sn bekle
        } catch (InterruptedException e)
        {
            System.out.println("hata oluştu");
        }
    }
}
