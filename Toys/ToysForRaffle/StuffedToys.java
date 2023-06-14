package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class StuffedToys extends Toys{

    public StuffedToys(UUID id) {
        super(id, "Мягкая игрушка", 40);
    }

    public StuffedToys(UUID id, int weight) {
        super(id, "Мягкая игрушка", weight);
    }

    @Override
    public void talkToMe(){
        System.out.println("Мягкая игрушка. Время обнимашек!");
    }
    
}
