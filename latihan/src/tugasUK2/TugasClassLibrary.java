package tugasUK2;
import javax.swing.JOptionPane;
public class TugasClassLibrary {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog(null, "Masukkan sudut dalam satuan derajat:");

            double sudut = Double.parseDouble(input);

            double radian = Math.toRadians(sudut);
            double sinus = Math.sin(radian);
            double cosinus = Math.cos(radian);

            String hasil = "Sudut: " + sudut + " derajat\n"
                    + "Sinus: " + sinus + "\n"
                    + "Cosinus: " + cosinus;

            JOptionPane.showMessageDialog(null, hasil, "Hasil Trigonometri", JOptionPane.INFORMATION_MESSAGE);

    }

}
