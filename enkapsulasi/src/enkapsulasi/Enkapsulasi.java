package enkapsulasi;
public class Enkapsulasi {
    private double panjang ;
    private double lebar;
    
    // menghitung luas
    private double luas(double p, double l) {
        return p * l;
    }
    public void setPanjang(double p) {
        panjang = p;
    }
    public void setLebar(double l) {
        lebar = l;
    }
    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getLuas() {
        return luas(panjang, lebar);
    }
}
