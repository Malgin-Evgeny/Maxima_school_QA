public abstract class Food {
    public Food(){}

    public Food(int zerno){
           this.zerno = zerno;
    }

    public void setZerno(int zerno) {
        this.zerno = zerno;
    }

    public Food(int meat, int water){
        this.meat = meat;
    }
    private int zerno;
    private int meat;
    private int water;

}
