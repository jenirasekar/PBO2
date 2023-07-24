
package operatorjava;


public class OperLogika {
    public static void main (String args[]) {
   boolean a = true, b = false;
   
   boolean log_AND = a && b;
   boolean log_OR = a || b;
   boolean log_NOTa = !a;
   boolean log_NOTb = !b;
   
        System.out.println(a + " AND " + b +" nilainya " + log_AND);
        System.out.println(a + " OR " + b +" nilainya " + log_OR);
        System.out.println(  "NOT " + a +" nilainya " + log_NOTa);
        System.out.println(  " NOT " + b +" nilainya " + log_NOTb);
    }
}
    