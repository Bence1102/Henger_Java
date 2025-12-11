package main;

import Model.Cso;
import Model.Henger;
import Model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public void run() {
        //lista();
        Henger h1 =  new Henger(4,8);
        Henger th1 =  new TomorHenger(5,10);
        Henger th2 =  new TomorHenger(5,10,0.5);
        Henger cs1 =  new Cso(6,12,0.3);
        Henger cs2 =  new Cso(3,6,1.5);
        hengerek.add(h1);
        hengerek.add(th1);
        hengerek.add(th2);
        hengerek.add(cs1);
        hengerek.add(cs2);
        int db=Henger.getHengerDarab();
        System.out.println("Felhasznált Hengerek száma:" + db);
        for(Henger henger:hengerek){
            System.out.println(henger);
        }
        System.out.println("\nHengerek térfogata:" + Henger.getHengerDarab());
        System.out.println("\nHengerek átlag térfogata: " + atlagTerfogat());
        System.out.println("\nCsövek súlya: " + csovekSulya());
    }

    public double atlagTerfogat() {
        return 0;
    }

    public double csovekSulya() {
        return 0;
    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }
}