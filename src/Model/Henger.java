package Model;

public class Henger {
    private static int hengerDarab = 0;
    private double sugar;
    private double magassag;

    public Henger(double r, double m) {
        this.sugar = r;
        this.magassag = m;
        hengerDarab++;
    }

    public static int getHengerDarab(){
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }


    public double terfogat(){
        return Math.PI * sugar * magassag;
    }


    @Override
    public String toString() {
        return "Model.Henger{" +
                "sugár=" + sugar +
                ", magasság=" + magassag +
                '}';
    }
}
