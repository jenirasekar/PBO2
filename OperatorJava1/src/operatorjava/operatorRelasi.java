
package operatorjava;


public class operatorRelasi {
    public static void main (String args[]) {
    int a = 100, b = 30;
    
    boolean kd = a < b;
    boolean ld = a > b;
    boolean ksm = a <= b;
    boolean lsm = a >= b;
    boolean sm = a == b;
    boolean ts = a != b;
    
        System.out.println(a + " < " + b +" nilainya " + kd);
        System.out.println(a + " > " + b +" nilainya " + ld);
        System.out.println(a + " = " + b +" nilainya " + sm);
        System.out.println(a + " <= " + b +" nilainya " + ksm);
        System.out.println(a + " >= " + b +" nilainya " + lsm);
        System.out.println(a + " != " + b +" nilainya " + ts);
        System.out.println();
        System.out.println(" <= ,artinya kurang dari atau sama dengan");
        System.out.println(" >= ,artinya lebih dari atau sama dengan");
        System.out.println(" != ,artinya tidak sama dengan");
        
    }
            
}
