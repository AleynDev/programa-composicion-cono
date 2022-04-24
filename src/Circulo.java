/**
 * <h1>Clase que representa un círculo</h1>
 * @Author Desconocido
 * @Version Desconocida
 */
public class Circulo {

    private float x, y;
    private float radio;

    /**
     * <h1>Constructor de la clase Círculo</h1>
     * @param cX cX
     * @param cY cY
     * @param r radio del círculo
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * <h3>Método para obtener el valor de x</h3>
     * @return valor de x
     */
    public float getX() { return x; }

    /**
     * <h3>Método para establecer el valor de x</h3>
     * @param x x
     */
    public void setX(float x) { this.x = x; }

    /**
     * <h3>Método para obtener el valor de y</h3>
     * @return valor de y
     */
    public float getY() { return y; }

    /**
     * <h3>Método para establecer el valor de y</h3>
     * @param y y
     */
    public void setY(float y) { this.y = y; }

    /**
     * <h3>Método para obtener el valor del radio del círculo</h3>
     * @return valor del radio
     */
    public float getRadio() { return radio; }

    /**
     * <h3>Método para establecer el valor del radio del círculo</h3>
     * @param radio radio del círculo
     */
    public void setRadio(float radio) { this.radio = radio; }

    /**
     * <h3>Método para hallar el área del círculo</h3>
     * @return valor del área del círculo
     */
    public float area() { return (float)Math.PI*radio*radio; }

    /**
     * <h3>Método para imprimir por consola los valores de x, y, radio y área</h3>
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
