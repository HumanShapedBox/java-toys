package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class BoardGame extends Toys{

    public BoardGame(UUID id) {
        super(id, "Настольная игра", 20);
    }

    public BoardGame(UUID id, int weight) {
        super(id, "Настольная игра", weight);
    }
    
    @Override
    public void talkToMe(){
        System.out.println("Настольная игра. Твой ход - бросай кубик!");
    }
}
