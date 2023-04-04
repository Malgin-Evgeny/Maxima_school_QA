public class Filters extends ConditionerDecorator {
    public Filters(Conditioner conditioner) {
        super(conditioner);
    }

    public String filter() {
        return ", фильтрует";
    }

    @Override
    public String cools() {
        return super.cools() + filter();
    }
}
