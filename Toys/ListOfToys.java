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
    
    public ArrayList<Toys> toysForGame;
    public int size;

    public ListOfToys(){
        this.toysForGame = new ArrayList<>();
        this.size = 20;
        fillList(toysForGame);
    }


    private void fillList(ArrayList<Toys> listOfToys) {
        for (int i = 0; i <= this.size; i++) {
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

    private void checkToys(ArrayList<Toys> listOfToys){
        for (Toys toy : listOfToys) {
            toy.countToys();
        }
    }

    private boolean isAvaileble(Toys nameOfToy){
        boolean flag = true;
        if(nameOfToy.getToysNum() == 0) flag = false;
        return flag;
    }

    private void lastOfToys(ArrayList<Toys> listOfToys){
        checkToys(listOfToys);
        for (Toys toy : listOfToys) {
            if(!isAvaileble(toy)) listOfToys.remove(toy);
        }
    }

    // public void gameOfToys(ArrayList<Toys> listOfToys){
    //     Toys winner;
        
    //     lastOfToys(listOfToys);
    //     winner.talkToMe();
    // }

}

