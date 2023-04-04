public class ConditionerDecorator implements Conditioner {
    Conditioner conditioner;

    public ConditionerDecorator(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public String cools() {
        return conditioner.cools();
    }
}
