/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author erics
 */
class Coche {
    private String chofer;
    private String copiloto;
    private String pasajero1;
    private String pasajero2;

    // Constructor
    public Coche(String chofer, String copiloto, String pasajero1, String pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    // Métodos para indicar la posición
    public void mostrarPosiciones() {
        System.out.println(chofer + " esta en el lugar del chofer.");
        System.out.println(copiloto + " esta en el lugar del copiloto.");
        System.out.println(pasajero1 + " esta en el lugar de pasajero 1.");
        System.out.println(pasajero2 + " esta en el lugar de pasajero 2.");
    }

}
