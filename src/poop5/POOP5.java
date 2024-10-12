/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Clase principal del proyecto POOP5.
 * En esta clase se ejecuta el método main que realiza acciones básicas 
 * como imprimir mensajes y crear instancias de la clase Coche.
 * @author erics
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circulo = new Circulo();
        // Creación de objetos de la clase Circulo
        circulo.getRadio();
        System.out.println(circulo.getRadio());
        
        circulo.setRadio(7.77f);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("****************");
        
        Fecha fechaDeNacimiento = new Fecha(05,12,2005);
        
        // Creación de objetos de la clase Persona 
        Persona persona = new Persona(); 
        persona.setEdad(18);
        persona.setEstatura(1.72f);
        persona.setNombre("Eric Soto");
        persona.setOcupacion("estudiante en la FI");
        persona.setfechaDeNacimiento(fechaDeNacimiento);
        
        System.out.println(persona);
        // Creación de objetos de la clase Coche
        Coche coche = new Coche("Juan", "Maria", "Carlos", "Ana");
        coche.mostrarPosiciones();
    }

    }
    
