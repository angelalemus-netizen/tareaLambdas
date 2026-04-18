import java.util.*;
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

    public static HashMap<String,Integer> mapaFrecuencias(ArrayList<String> Palabras){
        HashMap<String,Integer> frecuencias= new HashMap<>();
        Palabras.forEach(palabra ->
                frecuencias.merge(palabra,1,Integer::sum));
        return frecuencias;
    }
    public static ArrayList<String> clasificadorPalabras(HashMap<String,Integer> mapaFrec,int frecuencia) {
        return (ArrayList<String>) mapaFrec.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >=frecuencia)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static HashSet<String> deduplicacionPalabras(String frase,int n) {
        if(frase ==null ){
            return null;
        }

        return Arrays.stream(frase.split("\\s+"))
                .map(palabra-> palabra.replaceAll("[^\\p{L}\\p{Nd}]", ""))
                .filter(p-> !p.isEmpty() && p.length()>=n)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }


}
