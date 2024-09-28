package Hafta10_3._03_Soru;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    abstract void alan();
    abstract void cevre();

    public void ciz() {
        System.out.println(this.name + " Çizildi ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                '}';
    }
}
