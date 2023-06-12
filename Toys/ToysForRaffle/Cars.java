package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class Cars extends Toys{

    public Cars(UUID id) {
        super(id, "Машинка", 20, 30);
    }

    @Override
    public void talkToMe(){
        System.out.println("Машинка. Кчау!");
    }
    
}
