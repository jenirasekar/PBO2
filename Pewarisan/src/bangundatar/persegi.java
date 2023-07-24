package bangundatar;public class persegi extends bangundatar {
    float sisi;

    @Override
    float keliling() {
        float keliling = (float) (4*sisi);
        System.out.println("Keliling persegi    ="   +keliling);
        return keliling;
    }

    @Override
    float luas() {
        float luas = (float) (sisi*sisi);
        System.out.println("Luas persegi    ="    +luas);
       return luas;
    }
    
}
