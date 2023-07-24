package array;
public class conto_array_2D {
    public static void main(String[] args) {
        String[][] biodata = {
            {"NAMA", "JURUSAN"},
            {"Sarah", "TKJ"},
            {"Ahmad", "MM"},
            {"Jenira", "RPL"},};
        // mendeklarasikan baris dan kolom
        int i, j; // i = baris j = kolom
        for(i=0; i<4; i++) { // menampilkan sejumlah baris
        for(j=0; j<2; j++) {
            System.out.print(biodata[i][j]+" ");
        }
            System.out.println("");
        }
    }
}
