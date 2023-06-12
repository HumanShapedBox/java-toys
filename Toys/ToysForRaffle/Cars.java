package Toys.ToysForRaffle;

import Toys.Toys;

public class Cars extends Toys{

    public Cars(int id, String name, int amount, int weight) {
        super(id, "Машинка", 20, 30);
    }

    @Override
    public void talkToMe(){
        System.out.println("Машинка. Кчау!");
    }
    
}
