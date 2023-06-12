package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class BuildingKit extends Toys {

    public BuildingKit(UUID id) {
        super(id, "Конструктор", 15, 20);
    }

    @Override
    public void talkToMe(){
        System.out.println("Конструктор. Помни: кубики стоят, шарики катаются!");
    }

}