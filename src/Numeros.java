import java.util.ArrayList;

public class Numeros {

    public Numeros() {

    }

    static public ArrayList<Integer> elMultiplicador(ArrayList<Integer> numeros, int multiplicador) {
        numeros.replaceAll(n -> n * multiplicador);
        return numeros;
    }


}
