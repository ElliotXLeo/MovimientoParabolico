package clases;

public abstract class Cinematica {

    private double tiempo;
    private double velocidad;
    private double desplazamiento;

    public abstract double aceleracion();

    public Cinematica() {
    }

    public Cinematica(double tiempo, double velocidad, double desplazamiento) {
        this.tiempo = tiempo;
        this.velocidad = velocidad;
        this.desplazamiento = desplazamiento;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
