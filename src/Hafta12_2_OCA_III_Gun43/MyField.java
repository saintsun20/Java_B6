package Hafta12_2_OCA_III_Gun43;

public class MyField {

    int x;
    int y;

    public void doStuff(int x, int y) {   // 100, 200
        x = x;        // this.x=x;  this.x e bir şey atyılabildi mi
        y = this.y;   // this.y=y;  this.y ye bir şey atılamadı
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;

        MyField m2 = new MyField();  // m2 ilk başta 0,0
        m2.doStuff(m1.x, m1.y); // 100,200 bu gitti ama değişiklik olmadı
        // 0,0 kaldı

        m1.display(); // 100,200
        m2.display(); // 0,0
    }
}
