package figuras;
/** @author Salvador Ruano
 * @author Eduardo Estévez Lemes */
public class Test { /** @return Test realizado para comprobar el orrecto funcionamiento del código de la aplicación Circunferencia.java */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3)) /** @param considerarDecimales tipo boolean; c3 es un objeto tipo Circunferencia con parámetro radio tipo double */
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}
