public abstract class Food {
    public int zerno;
    public int meat;
    public int water;

    public Food() {
    }

    public Food(int meat, int water) {
        this.meat = meat;
        this.water = water;
    }

    public Food(int zerno) {
        this.zerno = zerno;
    }
}
