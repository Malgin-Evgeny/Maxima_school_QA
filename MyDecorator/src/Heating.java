public class Heating extends ConditionerDecorator {

    public Heating(Conditioner conditioner) {
        super(conditioner);
    }

    public String heating() {
        return ", греет";
    }

    @Override
    public String cools() {
        return super.cools() + heating();
    }
}
