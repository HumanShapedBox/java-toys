package Toys;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import Toys.ToysForRaffle.BoardGame;
import Toys.ToysForRaffle.BuildingKit;
import Toys.ToysForRaffle.Cars;
import Toys.ToysForRaffle.Dolls;
import Toys.ToysForRaffle.Robots;
import Toys.ToysForRaffle.StuffedToys;

public class ListOfToys {
    
    ArrayList<Toys> toysForGame = new ArrayList<>();

    public static void fillList(ArrayList<Toys> listOfToys) {
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    listOfToys.add(new Robots(UUID.randomUUID()));
                    break;
                case 1:
                    listOfToys.add(new BoardGame(UUID.randomUUID()));
                    break;
                case 2:
                    listOfToys.add(new StuffedToys(UUID.randomUUID()));
                    break;
                case 3:
                    listOfToys.add(new Dolls(UUID.randomUUID()));
                    break;
                case 4:
                    listOfToys.add(new Cars(UUID.randomUUID()));
                    break;
                default:
                    listOfToys.add(new BuildingKit(UUID.randomUUID()));
                    break;
            }
        }
    }
}
