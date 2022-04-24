/**
 * <h1>Clase que representa un cono</h1>
 * @Author Desconocido
 * @Version Desconocida
 */
public class Cono {

    private Circulo base;
    private float altura;
    private String color;

    /**
     * <h1>Constructor de la clase Cono</h1>
     * @param cX cX
     * @param cY cY
     * @param r Radio del círculo
     * @param h Altura del cono
     * @param color Color
     */
    public Cono (float cX, float cY, float r, float h, String color) {
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * <h3>Método para obtener la base del círculo</h3>
     * @return la base del circulo
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * <h3>Método para establecer la base del círculo</h3>
     * @param base base del círculo
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * <h3>Método para obtener la altura del cono</h3>
     * @return altura del cono
     */
    public float getAltura() {
        return altura;
    }

    /**
     * <h3>Método para establecer la altura del cono</h3>
     * @param altura altura del cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * <h3>Método para obtener el color del cono</h3>
     * @return color del cono
     */
    public String getColor() {
        return color;
    }

    /**
     * <h3>Método para establecer el color del cono</h3>
     * @param color color del cono
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <h3>Método para imprimir la base, altura y color</h3>
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }

}
