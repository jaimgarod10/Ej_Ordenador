
package ej_ordenador;

public class CPU {

 private int velocidad;
    private int memoria;

    public CPU(int velocidad, int memoria) {
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public CPU() {
    }
}
