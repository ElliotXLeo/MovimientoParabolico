package movimientoparabolico;

import clases.MovimientoParabolico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoMovimientoParabolico {

    public static void main(String[] args) {
        //Creación de objeto para dar formato a la salida de resultados
        DecimalFormat df = new DecimalFormat("#.##");

        //Creación de objeto movimientoParabolico
        MovimientoParabolico movimientoParabolico = new MovimientoParabolico();

        //Ingreso de valores
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese velocidad en m/s");
        movimientoParabolico.setVelocidad(ingreso.nextDouble());
        System.out.println("Ingrese ángulo en °");
        movimientoParabolico.setAngulo(ingreso.nextDouble());
        System.out.println("Ingrese altura de tiro en m");
        movimientoParabolico.setPosicionInicialY(ingreso.nextDouble());
        System.out.println("Ingrese gravedad en m/s^2");
        movimientoParabolico.setGravedad(ingreso.nextDouble());

        System.out.println("Vo = " + movimientoParabolico.getVelocidad() + " m/s");
        System.out.println("α = " + movimientoParabolico.getAngulo() + " °");
        System.out.println("Yo = " + movimientoParabolico.getPosicionInicialY() + " m");
        System.out.println("g = " + movimientoParabolico.getGravedad() + " m/s^2");

        System.out.println("Velocidad inicial en los ejes cardinales");
        System.out.println("Vox = " + df.format(movimientoParabolico.velocidadInicialX()) + " m/s");
        System.out.println("Voy = " + df.format(movimientoParabolico.velocidadInicialY()) + " m/s");

        System.out.println("Tiempo de altura máxima");
        System.out.println("tmax = " + df.format(movimientoParabolico.tiempoAlturaMaximaY()) + " s");

        System.out.println("Tiempo de vuelo");
        System.out.println("t = " + df.format(movimientoParabolico.tiempoVueloY()) + " s");

        System.out.println("Altura máxima");
        System.out.println("hmax = Yo + Voy*tmax - 1/2*g*tmax^2");
        System.out.println("hmax = " + df.format(movimientoParabolico.alturaMaximaY()) + " m");

        System.out.println("Distancia máxima");
        System.out.println("Xmax = " + df.format(movimientoParabolico.posicionFinalX()) + " m");
    }

}
