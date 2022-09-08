package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldoserPower;

    public Bulldozer(String name, String color, int power) {
        super.setName(name);
        super.setColor(color);
        this.bulldoserPower = power;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
