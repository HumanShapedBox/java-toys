package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class BoardGame extends Toys{

    public BoardGame(UUID id) {
        super(id, "Настольная игра", 20);
    }
    
    @Override
    public void talkToMe(){
        System.out.println("Настольная игра. Твой ход - бросай кубик!");
    }
}
