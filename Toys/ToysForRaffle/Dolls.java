package Toys.ToysForRaffle;

import Toys.Toys;

public class Dolls extends Toys{

    public Dolls(int id, String name, int amount, int weight) {
        super(id, "Кукла", 30, 40);
    }

    @Override
    public void talkToMe(){
        System.out.println("Кукла. Хлопаю глазами, пью, писаю и плачу!");
    }
    
}
