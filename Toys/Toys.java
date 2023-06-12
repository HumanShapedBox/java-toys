package Toys;

public abstract class Toys {
    private int id;
    protected String name;
    protected int amount;
    protected int weight;

    public Toys(int id, String name, int amount, int weight) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }
}