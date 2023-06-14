package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class Cars extends Toys{

    public Cars(UUID id) {
        super(id, "Машинка", 30);
    }

    public Cars(UUID id, int weight) {
        super(id, "Машинка", weight);
    }

    @Override
    public void talkToMe(){
        System.out.println("Машинка. Кчау!");
    }
    
}
