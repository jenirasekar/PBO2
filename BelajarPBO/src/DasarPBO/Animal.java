package DasarPBO;
public class Animal {
    String nama;
    int umur;
    String jenishidup;
    String spesies;
    
    public void setJenishidup(String jenishidup) {
        this.jenishidup = jenishidup;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur =  umur;
    }
    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }
    
    public void tampil() {
        System.out.println("Spesies :" +spesies);
        System.out.println("Nama :" +nama);
        System.out.println("Umur :" +umur);
        System.out.println("Habitat :" +jenishidup + "\n");
    }
    
    public static void main(String[] args) {
        Animal jerapah = new Animal();
        jerapah.spesies="Jerapah";
        jerapah.nama="Jerome";
        jerapah.umur=3;
        jerapah.jenishidup="Darat";
        jerapah.tampil();
        
       Animal kelinci = new Animal();
       kelinci.spesies="Kelinci";
       kelinci.nama="Bunny";
       kelinci.umur=2;
       kelinci.jenishidup="Darat";
       kelinci.tampil();
    }    
}
