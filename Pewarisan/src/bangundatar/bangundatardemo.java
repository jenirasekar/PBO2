package bangundatar;
public class bangundatardemo {
    public static void main(String[] args) {
        bangundatar bangunDatar =  new bangundatar();
        
        persegi p = new persegi();
        p.sisi = 7;
        
        lingkaran l = new lingkaran();
        l.jari = 14;
        
        persegipanjang pp = new persegipanjang();
        pp.lebar = 5;
        pp.panjang = 10;
        
        segitiga s = new segitiga();
        s.alas = 3;
        s.tinggi = 5;
        s.sisi = 4;
        
       bangunDatar.keliling();
       bangunDatar.luas();
       
       p.luas();
       p.keliling();
       
       l.luas();
       l.keliling();
       
       pp.luas();
       pp.keliling();
       
       s.luas();
       s.keliling();
}
    
}