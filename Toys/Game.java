package Toys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import Toys.ToysForRaffle.*;


public class Game {

    protected int amount;

    public void setAmount(int num){this.amount = num;}

    public void startGame(){
        int happyNumber = giveMeNumber();
        // ArrayList<Toys> listOfToys = new ArrayList<>();
        // for(int i = 0; i <= amount; i++){
        //     addToys(listOfToys, Robots);
        }

//    }

    // private void addToys(ArrayList<Toys> listOfToys) {
    //     for(int i = 0; i <= amount; i++){
    //         listOfToys.add(new Robots())
    //     }
    // }

    private void delToys(ArrayList<Toys> listOfToys, UUID id) {
        for (int i = 0; i <= listOfToys.size(); i++) {
            if (id.equals(listOfToys.get(i).getId())) {
                listOfToys.remove(listOfToys.get(i));
            }
        }
    }

    private int giveMeNumber(){
        int i;
        i = new Random().nextInt(101);
        return i;
    }

    private Set<Integer> prizeWeight(ArrayList<Toys> listOfToys){
        ArrayList<Integer> toysWeight = new ArrayList<>();
        for(int i = 0; i <= listOfToys.size(); i++){
            toysWeight.add(listOfToys.get(i).getWeight());
        }
        Set<Integer> uniqueWeight = new HashSet<>(toysWeight);
        return uniqueWeight;
    }

    private int winnerWeight(Set<Integer> toysWeigth, int num){
        int win = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer element : toysWeigth){
            nums.add(element);
        }
        for(int i = 0; i <= toysWeigth.size(); i++){
           nums.add(win - nums.get(i));
        }
        Collections.sort(nums);
        win = nums.get(0);
        return win;
    }

    private Toys giveMeWinner(ArrayList<Toys> listOfToys, int weight){
        Toys winner = null;
        Collections.shuffle(listOfToys);
        for(int i = 0; i <= listOfToys.size(); i++){
            if(weight == listOfToys.get(i).getWeight()){
                winner = listOfToys.get(i);
            }
        }
        return winner;
    }

}
