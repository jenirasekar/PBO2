/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPBO;

/**
 *
 * @author ThinkPad T440s
 */
public class siswa {
    String nama;
    int umur;
    char jenisKelamin;
    String kelas;
    String Alamat;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setJeniskelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    public void tampil() {
        System.out.println("Nama :" +nama);
        System.out.println("Umur    :" +umur);
        System.out.println("Jenis Kelamin   :" +jenisKelamin);
        System.out.println("Kelas   :" +kelas);
        System.out.println("Alamat  " +Alamat);
    }
    public static void main(String args[]) {
        siswa jenira = new siswa();
        jenira.nama = "Jenira Sekar Az-zahra";
        jenira.umur = 16;
        jenira.jenisKelamin = 'P';
        jenira.kelas = "XI RPL 2";
        jenira.Alamat = "Beteng, Sidomekar" + "\n";
        jenira.tampil();
        
        siswa rendy = new siswa();
        rendy.nama = "Rahmat Rendy Prayogo";
        rendy.umur = 17;
        rendy.jenisKelamin = 'L';
        rendy.kelas = "XII RPL 2";
        rendy.Alamat = "Kampung Baru, Semboro";
        rendy.tampil();       
    }
}
