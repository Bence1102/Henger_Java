package main;

import Model.Cso;
import Model.Henger;
import Model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;

    public HengerProgram() {
        this.hengerek = new ArrayList<>();
    }

    public void run() {
        lista();
        System.out.println("Hengerek száma:" + Henger.getHengerDarab());
        System.out.println("Átlag térfogat: " + atlagTerfogat());
        System.out.println("Csövek összsúlya: " + csovekSulya());
        System.out.println("\nLista:");
        hengerek.forEach(henger -> System.out.println(henger.toString()));
    }

    public void lista() {
        hengerek.add(new Henger(2, 10));
        hengerek.add(new TomorHenger(2, 10, 7.8));
        hengerek.add(new Cso(5, 20, 7.8, 1));
    }

    public double atlagTerfogat() {
        return 1.0;
    }

    public double csovekSulya() {
        return 0;
    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }
}