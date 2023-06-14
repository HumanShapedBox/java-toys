package Toys.ToysForRaffle;

import java.util.UUID;

import Toys.Toys;

public class BuildingKit extends Toys {

    public BuildingKit(UUID id) {
        super(id, "Конструктор", 20);
    }

    public BuildingKit(UUID id, int weight) {
        super(id, "Конструктор", weight);
    }

    @Override
    public void talkToMe(){
        System.out.println("Конструктор. Помни: кубики стоят, шарики катаются!");
    }

}