package fileio;
import java.io.File;
import java.io.IOException;

public class DemoBuatFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:/FolderJenira/contoh.txt");
        if (f.exists()) {
            System.out.println("File sudah ada");
        } else {
            f.createNewFile();
            System.out.println("Sukses membuat file baru");
        }
    }
}
