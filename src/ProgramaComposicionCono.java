/**
 * Clase que representa el programa principal. Se trata de una aplicación de consola
 * y crea cinco objetos cono e imprime por pantalla sus atributos.
 * @Author Desconocido
 * @Version Desconocida
 */
public class ProgramaComposicionCono {

    /**
     * <h1>Método estatico que imprime datos por consola</h1>
     * @param datos datos a imprimir por consola
     */
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }

    /**
     * <h1>Punto de entrada/arranque de la aplicación</h1>
     * @param args
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }

}
