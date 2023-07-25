package latihan;
import javax.swing.JOptionPane;
public class ContohClassLibrary2 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Masukkan nama Anda:");
        JOptionPane.showMessageDialog(null, "Halo " + nama);
    }
}
