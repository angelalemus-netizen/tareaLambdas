//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Preubas ");

    //elMultiplicador
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, -3, 0));
    System.out.println("elMultiplicador Original: " + nums);
    Numeros.elMultiplicador(nums, 10);
    System.out.println("Resultado (x10): " + nums);
    System.out.print("\n");

    //Lista vacía
    ArrayList<Integer> vacia = new ArrayList<>();
    System.out.println("Caso Vacío: " + Numeros.elMultiplicador(vacia, 5));
    System.out.print("\n");

    //  filtroSelectivo
    ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Auto", "Avion", "Barco", "Sol", "Porra"));
    System.out.println("filtroSelectivo \nOriginal: " + palabras);
    // empiezan con 'A' o longitud menor a 4
    Letras.filtroSelectivo(palabras, 'A', 4);
    System.out.println("Resultado (Sin 'A' y largo >= 4): " + palabras);
    System.out.print("\n");

    //  convertorMayusculas
    ArrayList<String> mixtas = new ArrayList<>(Arrays.asList("hola", "Mundo"));
    System.out.println("convertorMayusculas \nOriginal: " + mixtas);
    System.out.println("Resultado: " + Letras.convertorMayusculas(mixtas));
    System.out.print("\n");

    //  cuadradosUnicos
    ArrayList<Integer> repetidos = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4));
    System.out.println("cuadradosUnicos \nOriginal: " + repetidos);
    System.out.println("Resultado: " + Numeros.cuadradosUnicos(repetidos));
    System.out.print("\n");

    //  mapaLongitudes
    ArrayList<String> listaMap = new ArrayList<>(Arrays.asList("Java", "Stream", "Code"));
    System.out.println("mapaLongitudes \nOriginal: " + listaMap);
    System.out.println("Resultado: " + Letras.mapaLongitudes(listaMap));
    System.out.print("\n");

    // modificadorInventario
    HashMap<String, Double> inv = new HashMap<>();
    inv.put("Laptop", 1000.0);
    inv.put("Mouse", 20.0);
    System.out.println("modificadorInventario\nprecio original "+inv);
    System.out.println("Ejecucion:");
    Numeros.modificadorInventario(inv);
    System.out.print("\n");

    // mapaFrecuencias
    ArrayList<String> repetidas = new ArrayList<>(Arrays.asList("uno", "dos", "uno", "tres", "dos", "uno"));
    System.out.println("mapaFrecuencias \nOriginal: " + repetidas);
    HashMap<String, Integer> frec = Letras.mapaFrecuencias(repetidas);
    System.out.println("Resultado: " + frec);
    System.out.print("\n");

    // clasificadorPalabras
    System.out.println("clasificadorPalabras \nDesde el mapa anterior (Frec >= 2):");
    System.out.println("Resultado: " + Letras.clasificadorPalabras(frec, 2));
    System.out.print("\n");

    // deduplicacionPalabras
    System.out.println("deduplicacionPalabras \nCaso Normal: Hola hola, mundo! (N=5)");
    System.out.println("Resultado: " + Letras.deduplicacionPalabras("Hola hola, mundo!", 5));

    // Caso Edge- Nulo
    System.out.println("Caso Nulo: " + Letras.deduplicacionPalabras(null, 2));

    // Caso Edge- Frase vacia o solo espacios
    System.out.println("Caso Vacio: " + Letras.deduplicacionPalabras("   ", 1));

    // Caso Edge- Signos de puntuacion masivos
    System.out.println("Caso Puntuacion: '¡¿Java?!... 100%' (N=1)");
    System.out.println("Resultado: " + Letras.deduplicacionPalabras("¡¿Java?!... 100%", 1));
    System.out.print("\n");

    //topePrecios
    HashMap<String, Integer> precios = new HashMap<>();
    precios.put("Arroz", 50);
    precios.put("Pan", 10);
    System.out.println("topePrecios \nAntes (Tope 30): " + precios);
    Numeros.topePrecios(precios, 30);
    System.out.println("Despues: " + precios);
}
