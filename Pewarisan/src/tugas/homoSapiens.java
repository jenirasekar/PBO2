package tugas;
public class homoSapiens {
    String warnaRambut; 
    String mata;
    String kulit;
    String bahasa;
    String nama;
    
    void info() {
        System.out.println("Nama    :"  +nama);
            System.out.println("Warna rambut    :"  +warnaRambut);
            System.out.println("Mata    :"  +mata);
            System.out.println("Kulit   :"  +kulit);
            System.out.println("Bahasa  :"  +bahasa);
}
}

class manusia extends homoSapiens {
    String sifat;
    void info2() {
        System.out.println("Sifat   :"  +sifat);
    }
}

