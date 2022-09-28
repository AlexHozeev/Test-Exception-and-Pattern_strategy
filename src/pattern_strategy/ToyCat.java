package pattern_strategy;

public class ToyCat implements ISound{
    @Override
    public String playSound() {
        return "low battery";
    }
}
