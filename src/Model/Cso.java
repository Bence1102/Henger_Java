package Model;

public class Cso extends TomorHenger {
    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag,1,falvastagsag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }

    @Override
    public String toString() {
        return "Model.Cso{" +
                "sugár=" + getSugar() +
                ", magasság=" + getMagassag() +
                ", falvastagság=" + falvastagsag +
                '}';
    }
}
