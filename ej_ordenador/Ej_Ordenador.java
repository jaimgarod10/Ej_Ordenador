
package ej_ordenador;

import java.util.Scanner;

public class Ej_Ordenador {

    public static void main(String[] args) {
          
        Scanner teclado = new Scanner(System.in);

        System.out.println(" tipo do ratón? ");
        String tipo = teclado.nextLine();
        System.out.println(" marca de la pantalla? ");
        String marca = teclado.nextLine();
        System.out.println("pulgadas de la pantalla? ");
        float pulgadas = teclado.nextFloat();
        System.out.println(" velocidad de la CPU? ");
        int velocidade = teclado.nextInt();
        System.out.println(" memoria de la CPU? ");
        int memoria = teclado.nextInt();

        Ratón rato = new Ratón(tipo);
        Pantalla pantalla = new Pantalla(marca, pulgadas);
        CPU cpu = new CPU(velocidade, memoria);
        Ordenador ordenador = new Ordenador(rato, pantalla, cpu);
        ordenador.amosar();

    }
 }
