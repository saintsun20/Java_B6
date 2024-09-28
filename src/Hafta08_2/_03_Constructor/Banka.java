package Hafta08_2._03_Constructor;

import Hafta08_2._02_Constructor_3.Book;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() { this(" ", 0, 0);}

    public Banka(String adi, int subeSayisi) { this(adi,subeSayisi, 0);}

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }


    public String toString() {
        return "Banka{" + "adi = '" + adi + '\'' + ", subeSayisi =" + subeSayisi + ", kurulusYili = " + kurulusYili + '}';
    }

}
