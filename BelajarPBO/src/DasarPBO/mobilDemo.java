package DasarPBO;
public class mobilDemo {
    public void isidata(String mrk, String bb, String tp, int vt, int kpl) {
        merek=mrk;
        bahanBakar=bb;
        tahunPembuatan=tp;
        voltangki=vt;
        kpliter=kpl;
    }
    String merek, bahanBakar, tahunPembuatan;
    int voltangki;
    int kpliter;
    
    int tempuh() {
        return kpliter * voltangki;
    }
    double perluBahanBakar(int km) {
        return(double) km / kpliter;
    }
}
