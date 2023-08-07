package fileio;
import java.io.File;

public class DemoBuatFolder {
    public static void main(String[] args) {
        File f = new File("C:/FolderJenira");
        if (f.exists()) {
            System.out.println("Direktori sudah ada!");
        } else {
            f.mkdir();
            System.out.println("Sukses membuat folder baru");
        }
    }
}
