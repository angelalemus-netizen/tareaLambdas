import java.util.ArrayList;
import java.util.HashMap;
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
    public  static HashMap<String,Integer> mapaLongitudes(ArrayList<String> Palabras){

        return Palabras.stream()
                .collect(Collectors.toMap(
                        palabra -> palabra,
                        String::length,
                        (long1,long2) -> long1,
                        HashMap::new
                ));

    }
}
