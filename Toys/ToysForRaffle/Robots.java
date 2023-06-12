package Toys.ToysForRaffle;

import Toys.Toys;

public class Robots extends Toys {

    public Robots(int id, String name, int amount, int weight) {
        super(id, "Робот", 10, 10);
    }
    
    @Override
    public void talkToMe(){
        System.out.println("Робот. Бип-буп-буп, бро!");
    }
}
