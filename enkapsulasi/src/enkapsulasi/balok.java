package enkapsulasi;
public class balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    private double volume(double p, double l, double t) {
        return p*l*t;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getVolume() {
        return volume(panjang, lebar, tinggi);
    }
}
