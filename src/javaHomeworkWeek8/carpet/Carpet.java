package javaHomeworkWeek8.carpet;

public class Carpet {

    double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0: cost;
    }

    public double getCost() {
        return this.cost;
    }
}
