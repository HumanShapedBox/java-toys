package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class Robots extends Toys {

    public Robots(UUID id) {
        super(id, "Робот", 10);
    }
    
    @Override
    public void talkToMe(){
        System.out.println("Робот. Бип-буп-буп, бро!");
    }
}
