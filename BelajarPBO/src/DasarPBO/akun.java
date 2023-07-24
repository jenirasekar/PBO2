package DasarPBO;
public class akun {
    String nama;
    String alamat;
    double saldo;
    
    public void isiData(String n, String al, double sal) {
       nama=n;
       alamat=al;
       saldo=sal;
    }
    public void tampil(){
        System.out.println("Data Akun");
        System.out.println("Nama    : "+ nama);
        System.out.println("Alamat  : "+ alamat);
        System.out.printf("Saldo   :   %,.2f", saldo);
    }
//    method tipe return dan berparameter
    public double getBunga(double persenRata) {
        return saldo * persenRata / 100;
    }
}
