import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Numeros {

    public Numeros() {

    }

    static public ArrayList<Integer> elMultiplicador(ArrayList<Integer> numeros, int multiplicador) {
        numeros.replaceAll(n -> n * multiplicador);
        return numeros;
    }

    static public HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> hashSet = (HashSet<Integer>) numeros.stream()
                .collect(Collectors.toSet());
        return hashSet;
    }
}
