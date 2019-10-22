
package ej_ordenador;

public class Ordenador {
    
    private Ratón ratón = new Ratón();
    private Pantalla pantalla = new Pantalla();
    private CPU cpu = new CPU();

    public Ordenador() {
    }
    public Ordenador (Ratón raton, Pantalla pantalla, CPU cpu){
    this.ratón=raton;
    this.pantalla=pantalla;
    this.cpu=cpu;
    }

    public Ratón getRato() {
        return ratón;
    }

    public void setRato(Ratón rato) {
        this.ratón = rato;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void amosar() {
        System.out.println("Tipo do rato: " + ratón.getTipo()
                + "\nMarca da pantalla: " + pantalla.getMarca()
                + "\nPulgadas da pantalla: " + pantalla.getPulgadas()
                + "\nMemoria da CPU: " + cpu.getMemoria()
                + "\nVelocidade da CPU: " + cpu.getVelocidad());
    }
    
}
