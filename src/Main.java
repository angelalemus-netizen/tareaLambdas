//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(2);
    numeros.add(0);

    System.out.println(numeros);
    System.out.println(Numeros.elMultiplicador(numeros,-2));

    ArrayList<String> lista = new ArrayList<>(Arrays.asList(
            "manzana", "pera", "uvas", "Avispa", "p", "melon"
    ));
    ArrayList<String> otralista = new ArrayList<>(Arrays.asList(
            "manzana", "pera", "uvas", "Avispa", "p", "melon","melon"
    ));

    char letrainico= 'm';
    System.out.println(lista);
    System.out.println(Letras.filtroSelectivo(lista,letrainico,5));

    System.out.println(lista);
    System.out.println(Letras.convertorMayusculas(lista));

    System.out.println(numeros);
    System.out.println(Numeros.cuadradosUnicos(numeros));

    System.out.println(otralista);
    System.out.println(Letras.mapaLongitudes(otralista));

    HashMap<String,Double> inventario = new HashMap<>();
    inventario.put("manzana", 35.0);
    inventario.put("pera", 20.0);
    inventario.put("uvas", 70.0);

    System.out.println(inventario);
    Numeros.modificadorInventario(inventario);

    System.out.println(otralista);
    System.out.println(Letras.mapaFrecuencias(otralista));

    HashMap<String,Integer> lista3 = new HashMap<>();
    lista3.put("manzana", 10);
    lista3.put("pera", 3);
    lista3.put("uvas", 5);
    System.out.println(lista3);
    System.out.println(Letras.clasificadorPalabras(lista3,8));
}
