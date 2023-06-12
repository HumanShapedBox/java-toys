package Toys;

import java.util.UUID;

public abstract class Toys implements ToysInterface{
    protected UUID id;
    protected String name;
    protected int amount;
    protected int weight;

    public Toys(int id, String name, int amount, int weight) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.weight = weight;
    }

    public void countToys() {
        this.amount -= 1;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
}

