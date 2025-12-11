package Model;

public class TomorHenger extends Henger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag,1);
    }
    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return this.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os+ "TomorHenger{" +
                "sugár=" + getSugar() +
                ", magasság=" + getMagassag() +
                ", fajsúly=" + fajsuly +
                " suly=" + String.format("%.2f",suly()) +
                '}';
    }
}
