package Toys.ToysForRaffle;

import Toys.Toys;

public class BuildingKit extends Toys {

    public BuildingKit(int id, String name, int amount, int weight) {
        super(id, "Конструктор", 15, 20);
    }

    @Override
    public void talkToMe(){
        System.out.println("Конструктор. Помни: кубики стоят, шарики катаются!");
    }

}