package enkapsulasi;
public class balokDemo {
    public static void main(String[] args) {
        balok jenira = new balok();
        jenira.setPanjang(10);
        jenira.setLebar(7);
        jenira.setTinggi(6);
        
        System.out.println("Volume  :" + jenira.getVolume());
        
    }
}
