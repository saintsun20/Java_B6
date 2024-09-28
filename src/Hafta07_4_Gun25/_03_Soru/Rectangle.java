package Hafta07_4_Gun25._03_Soru;

public class Rectangle {
    int length;
    int width;

    void alan()
    {
        System.out.println("Alan="+
                (this.length*this.width) );
    }

    void cevre()
    {
        System.out.println("Cevre="+
                ( (this.length+this.width)*2 ));
    }

}
