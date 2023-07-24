package bangundatar;
public class lingkaran extends bangundatar{
    float jari;

    @Override
    float keliling() {
        float keliling = (float) (2*Math.PI*jari);
        System.out.println("Keliling lingkaran  =" +keliling);
        return keliling;
    }

    @Override
    float luas() {
        float luas = (float) (Math.PI*jari*jari);
        System.out.println("Luas lingkaran  =" +luas);
        return luas;
    }
    
    
}
