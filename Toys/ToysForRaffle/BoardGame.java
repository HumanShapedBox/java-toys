package Toys.ToysForRaffle;

import Toys.Toys;

public class BoardGame extends Toys{

    public BoardGame(int id, String name, int amount, int weight) {
        super(id, "Настольная игра", 15, 20);
    }
    
    @Override
    public void talkToMe(){
        System.out.println("Настольная игра. Твой ход - бросай кубик!");
    }
}
