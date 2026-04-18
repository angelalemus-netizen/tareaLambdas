Este proyecto contiene una serie de utilidades estáticas diseñadas para demostrar el manejo avanzado 
de colecciones (List, Set, Map) y la API de Streams en Java

elMultiplicador(ArrayList<Integer> numeros, int multiplicador)
Multiplica cada elemento de una lista por un factor dado usando replaceAll.
Ejemplo de ejecucion: [1, 2, 0], factor -2 
Salida esperada: [-2, -4, 0]

filtroSelectivo(ArrayList<String> Palabras, char letraInicial, int longitud)
Elimina palabras que comiencen por una letra específica o tengan una longitud menor a N.
Ejemplo de ejecucion: ["Pera", "Avispa"], 'A', 3
Salida esperada: ["Pera"]

cuadradosUnicos(ArrayList<Integer> numeros)
Transforma una lista en un HashSet para garantizar elementos únicos.
Ejemplo de ejecucion: [1, 2, 2, 0]
Salida esperada: [0, 1, 2]

convertorMayusculas(ArrayList<String> Palabras)
Crea una nueva lista con todas las palabras transformadas a mayúsculas mediante Stream.
Ejemplo de ejecucion: ["hola", "java"]
Salida esperada: ["HOLA", "JAVA"]

modificadorInventario(HashMap<String,Double> inventario)
Recorre un mapa de productos y precios, aplicando y mostrando un descuento del 10% mediante BiConsumer.
Ejemplo de ejecucion: {"Manzana"=35.0}
Salida esperada: Producto: Manzana | Precio desc: $31.5

mapaLongitudes(ArrayList<String> Palabras)
Genera un mapa donde la clave es la palabra y el valor es su longitud.
Ejemplo de ejecucion: ["uvas", "uvas"]
Salida esperada: {"uvas"=4}

mapaFrecuencias(ArrayList<String> Palabras)
Calcula cuántas veces aparece cada palabra en una lista usando merge.
Ejemplo de ejecucion: ["melon", "melon"]
Salida esperada: {"melon"=2}

clasificadorPalabras(HashMap<String,Integer> mapaFrec,int frecuencia)
Filtra un mapa de frecuencias para obtener solo las palabras que aparecen N o más veces.
Ejemplo de ejecucion: {"a"=10, "b"=3}, N=8
Salida esperada: ["a"]

deduplicacionPalabras(String frase,int n)
Procesa una frase String, elimina puntuación, convierte a minúsculas, filtra por longitud mínima y elimina duplicados.
Ejemplo de ejecucion: "HOLA, hola!", N=4
Salida esperada: ["hola"]

topePrecios(HashMap<String,Integer> mapa, int n)
Limita los valores de un mapa a un máximo de $N$ utilizando una expresión lambda.
Ejemplo de ejecucion: {"Uvas"=20}, N=8
Salida esperada: {"Uvas"=8}
