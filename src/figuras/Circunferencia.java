package figuras;
/** @author Salvador Ruano
 * co - @author Eduardo Estévez Lemes
 * @version 3.0
 * @since 21/12/2021
 * @return Ejercicio 6.1 de la asignatura Entornos de Desarrollo. Dirigida por Salvador Ruano*/

public class Circunferencia {
/** @return Este proyecto es una calcladora de áreas para circunferencias */
    private double radio;
    private String color;

    public Circunferencia(double radio) { /** @param radio tipo double */
        this.radio = radio;
    }

    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double calcularArea = 2 * 3.1416 * radio * radio;
        double area = calcularArea;
        System.out.println(area);
}

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) { /** @param considerarDecimales tipo boolean; Circunferencia otro tipo double */
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    public void setRadio(double radio) { /** @deprecated  Este método se declaró para el ejercicio de la actividad 6.1, pero no está en uso */
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}/** @return Realización de la actividad punto por punto y con resultado satisfactorio */

