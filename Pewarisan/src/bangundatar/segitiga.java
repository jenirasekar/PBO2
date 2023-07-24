package bangundatar;
public class segitiga extends bangundatar {
    float alas;
    float tinggi;
    float sisi;

    @Override
    float keliling() {
        float keliling = (float) (alas+sisi+sisi);
        System.out.println("Keliling segitiga   ="  +keliling);
        return keliling;
    }

    @Override
    float luas() {
        float luas = (float) (alas*tinggi/2);
        System.out.println("Luas segitiga   ="  +luas);
        return luas;
    }

   
    
}
