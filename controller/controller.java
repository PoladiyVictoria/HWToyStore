package controller;

import java.util.Scanner;

import service.PlayService;
import service.ToyStoreService;

public class controller {
    private final ToyStoreService storeService = new ToyStoreService();
    private final PlayService playService = new PlayService();

    public void createToyStore(int id, String name, int quantity, double weight){
        storeService.addToy(id, name, quantity, weight);
    }

    public void setToyWeight(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id игрушки у которой хотите установить вес");
        Integer id = in.nextInt();
        System.out.println("Введите Вес игрушки");
        Double weight = in.nextDouble();
        storeService.setToyWeight(id, weight);
    }

    public void toyRaffle(){
        playService.play();
        try{
            playService.getPrizeToy();
        }catch(Exception e){
            e.getMessage();
        }
        
    }
}
