/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author erics
 */
class Persona {
     private int edad;
    private float estatura;
    private String nombre;
    private Fecha fechaDeNacimiento;
    String ocupacion;
    
    public Persona(){   
    }
    
    public Persona(int edad, float estatura, String nombre,Fecha fechaDeNacimiento, String ocupacion){
     this.edad = edad;
     this.estatura = estatura;
     this.nombre=nombre;
     this.fechaDeNacimiento = fechaDeNacimiento;
     this.ocupacion = ocupacion;
    }
    
    public int getEdad(){
     return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public float getEstatura(){
        return estatura;
    }
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Fecha fechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public void setfechaDeNacimiento(Fecha fechaDeNacimiento){
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
    
    public String getOcupacion(){
        return ocupacion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }
    
    public boolean comer(){
        return true;
    }
    public boolean jugar(){
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", estatura=" + estatura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    }
}
