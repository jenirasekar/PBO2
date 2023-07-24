package enkapsulasi;
public class enkapsulasiDemo {
    public static void main(String[] args) {
        Enkapsulasi obj = new Enkapsulasi();
        obj.setPanjang(50);
        obj.setLebar(4);
    
        System.out.println("Panjang :" + obj.getPanjang());
        System.out.println("Lebar   :" + obj.getLebar());
        System.out.println("Luas    :" + obj.getLuas());
    }
}