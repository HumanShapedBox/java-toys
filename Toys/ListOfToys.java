package Toys;

import java.util.ArrayList;
import java.util.UUID;

public class ListOfToys {

    public ArrayList<Toys> toysForGame;
    protected int amount;

    public ListOfToys() {
        this.toysForGame = new ArrayList<>();
        this.amount = 0;
    }

    public void setAmount(int num) {
        this.amount = num;
    }

    public void addToys(ArrayList<Toys> listOfToys, Toys item) {
        listOfToys.add(item);
    }

    public void delToys(ArrayList<Toys> listOfToys, Toys item, UUID id) {
        for (int i = 0; i <= listOfToys.size(); i++) {
            if (id.equals(item.getId())) {
                listOfToys.remove(item);
            }
        }
    }

}

