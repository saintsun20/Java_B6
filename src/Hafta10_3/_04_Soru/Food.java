package Hafta10_3._04_Soru;

public abstract class Food {
    private String name;
    abstract void madeIn();
    abstract void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
