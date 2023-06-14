package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class Dolls extends Toys{

    public Dolls(UUID id) {
        super(id, "Кукла", 40);
    }

    @Override
    public void talkToMe(){
        System.out.println("Кукла. Хлопаю глазами, пью, писаю и плачу!");
    }
    
}
