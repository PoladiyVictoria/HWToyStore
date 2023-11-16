package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import data.Play;
import data.Toy;

public class PlayService {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;

    public void play() {

        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        Toy prizeToy = null;
        for (Toy toy : toys) {
            if (randomNumber < toy.getWeight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        if (prizeToy != null && prizeToy.getQuantity() > 0) {
            prizeToys.add(prizeToy);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            Toy prizeToy = prizeToys.remove(0);
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write(prizeToy.getId() + "," + prizeToy.getName() + "\n");
            writer.close();
        }
    }
}
