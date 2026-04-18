import java.util.ArrayList;
import java.util.stream.Collectors;

public class Letras {

    public static ArrayList<String> filtroSelectivo(ArrayList<String> Palabras, char letraInicial, int longitud) {

        Palabras.removeIf(palabras -> palabras.length() < longitud || palabras.toLowerCase().startsWith(String.valueOf(letraInicial).toLowerCase()));
        return Palabras;
    }
    public static ArrayList<String> convertorMayusculas(ArrayList<String> Palabras) {
        ArrayList<String> convertidas= Palabras.stream().map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
        return convertidas;
    }
}
