package bangundatar;
public class persegipanjang extends bangundatar {
    float panjang;
    float lebar;

    @Override
    float keliling() {
        float keliling = (float) (panjang + panjang + lebar + lebar);
        System.out.println("Keliling persegi panjang    = " +keliling);
        return keliling;
    }

    @Override
    float luas() {
        float luas = (float) (panjang*lebar);
        System.out.println("Luas persegi panjang  ="    +luas);
        return luas;
    }
    
    
}
