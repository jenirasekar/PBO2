package tugasUK6;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LatihanIO {
    public static void main(String[] args) {
        String directoryPath = "C:/FolderJenira/LatihanIO";
        String filePath = directoryPath + "/pendidikan.txt";

        File dir = new File(directoryPath);
        File file = new File(filePath);

        try {
            if (dir.exists()) {
                System.out.println("Direktori sudah ada!");
            } else {
                if (dir.mkdir()) {
                    System.out.println("Sukses membuat direktori baru!");
                } else {
                    System.out.println("Gagal membuat direktori baru!");
                    return;
                }
            }

            if (file.exists()) {
                System.out.println("File sudah ada!");
            } else {
                if (file.createNewFile()) {
                    System.out.println("Sukses membuat file baru!");
                } else {
                    System.out.println("Gagal membuat file baru!");
                    return;
                }
            }

            FileWriter fwrite = new FileWriter(filePath);
            fwrite.write("Ing ngarsa sung tuladha\n");
            fwrite.write("Ing madya mangun karsa\n");
            fwrite.write("Tut wuri handayani\n");
            fwrite.close();

            FileReader fread = new FileReader(filePath);
            int i;
            while ((i = fread.read()) != -1) {
                System.out.print((char) i);
            }
            fread.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
