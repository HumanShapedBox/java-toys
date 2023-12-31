package Toys;

import java.util.UUID;

public abstract class Toys implements ToysInterface{
    protected UUID id;
    protected String name;
    protected int weight;

    public Toys(UUID id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(int newWeight){this.weight = newWeight;}

    public int getWeight(){return this.weight;}

    public UUID getId(){return this.id;};
}

