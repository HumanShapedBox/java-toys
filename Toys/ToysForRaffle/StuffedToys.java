package Toys.ToysForRaffle;

import Toys.Toys;

public class StuffedToys extends Toys{

    public StuffedToys(int id, String name, int amount, int weight) {
        super(id, "Мягкая игрушка", 30, 40);
    }

    @Override
    public void talkToMe(){
        System.out.println("Мягкая игрушка. Время обнимашек!");
    }
    
}
