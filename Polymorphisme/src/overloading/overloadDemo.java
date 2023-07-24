package overloading;
public class overloadDemo {
    public static void main(String[] args) {
        overLoad ob = new overLoad();
        int hasilInt;
        double hasilD;
        
        ob.ovlDemo();
        System.out.println();
        
        ob.ovlDemo(2);
        System.out.println();
        
        hasilInt = ob.ovlDemo(3, 7);
        System.out.println("Hasil dari ob.ovlDemo(3, 7): " + hasilInt);
        
        System.out.println();
        
        hasilD = ob.ovlDemo(2.5, 5.2);
        System.out.println("Hasil dari ob.ovlDemo(2.5 5.2): " + hasilD);
    }
}
