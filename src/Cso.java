public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        double kulso = Math.PI * Math.pow(getSugar(), 2) * getMagassag();
        double belso = Math.PI * Math.pow(getSugar() - falvastagsag, 2) * getMagassag();
        return kulso - belso;
    }

    @Override
    public String toString() {
        return "Cso{" +
                "sugár=" + getSugar() +
                ", magasság=" + getMagassag() +
                ", falvastagság=" + falvastagsag +
                '}';
    }
}
