package array;
public class contoh_array_2D_1 {
    public static void main(String[] args) {
          int t, i;
          int tabel[][] = new int[3][4];
          for(t=0; t < 3; ++t) {
              for(i = 0; i < 4; ++i) {
                  tabel[t][i] = (t*4)+i+1;
                  System.out.print(tabel[t][i]+" ");
              }
              System.out.println();
          }
    }
}
