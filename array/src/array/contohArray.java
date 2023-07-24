package array;
public class contohArray {
    public static void main(String[] args) {
        // misal ada kardus dinamai sampel sampai berisi 10 "wadah"
        int sampel[] = new int[10];
        int  i;
        
        // ke-10 "wadah" diisi bilangan0-9 dengan berulang
        // secara increment
        for(i = 0; i < 10; i = i+1)
            sampel[i] = i;
        
        for(i = 0; i < 10; i = i+1)
            System.out.println("Ini isi wadah ke-[" + i +"]: "+ sampel[i]);
    }
}
