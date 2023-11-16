import controller.controller;

public class Main {
    public static void main(String[] args) {
        controller contr = new controller();
        contr.createToyStore(1, "1", 1, 1.0);
        contr.createToyStore(2, "2", 2, 1.2);
        contr.setToyWeight();
        contr.toyRaffle();
    }
    
}
