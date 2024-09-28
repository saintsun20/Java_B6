package Hafta09_4_Gun33._03_Protected.Paket1;

public class P1Hayvan {
    public String ad        ; // her yerden
    int yas                 ; // sadece kendi paketinden
    protected String cinsi  ; // kendi paketinden + extend edilen diğer classların içinden
    private String renk     ; // sadece kendi class ın için
}
