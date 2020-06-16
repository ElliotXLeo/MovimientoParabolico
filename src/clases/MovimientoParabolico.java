package clases;

public class MovimientoParabolico extends Cinematica implements InterfaceMovimientoParabolico {

    private double gravedad = 9.8;
    private double angulo;
    private double posicionInicialY = 0;

    public MovimientoParabolico() {
    }

    public MovimientoParabolico(double gravedad, double angulo, double posicionInicialY, double velocidad) {
        super(velocidad);
        this.gravedad = gravedad;
        this.angulo = angulo;
        this.posicionInicialY = posicionInicialY;
    }

    public MovimientoParabolico(double gravedad, double angulo, double posicionInicialY, double tiempo, double velocidad, double desplazamiento) {
        super(tiempo, velocidad, desplazamiento);
        this.gravedad = gravedad;
        this.angulo = angulo;
        this.posicionInicialY = posicionInicialY;
    }

    @Override
    public double aceleracion() {
        return this.gravedad;
    }

    @Override
    public double velocidadInicialX() {
        return (super.getVelocidad() * Math.cos(Math.toRadians(this.angulo)));
    }

    @Override
    public double velocidadInicialY() {
        return (super.getVelocidad() * Math.sin(Math.toRadians(this.angulo)));
    }

    @Override
    public double tiempoAlturaMaximaY() {
        return (velocidadInicialY() / aceleracion());
    }

    @Override
    public double tiempoVueloY() {
        return ((-velocidadInicialY() - (Math.pow((Math.pow(velocidadInicialY(), 2) - (4.0 * (-aceleracion() / 2.0) * this.posicionInicialY)), (1.0 / 2.0))))) / ((2.0 * (-aceleracion() / 2.0)));

    }

    @Override
    public double alturaMaximaY() {
        return (this.posicionInicialY + (velocidadInicialY() * tiempoAlturaMaximaY()) - ((1.0 / 2.0) * aceleracion() * (Math.pow(tiempoAlturaMaximaY(), 2))));
    }

    @Override
    public double posicionFinalX() {
        return (velocidadInicialX() * tiempoVueloY());
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getPosicionInicialY() {
        return posicionInicialY;
    }

    public void setPosicionInicialY(double posicionInicialY) {
        this.posicionInicialY = posicionInicialY;
    }

}
