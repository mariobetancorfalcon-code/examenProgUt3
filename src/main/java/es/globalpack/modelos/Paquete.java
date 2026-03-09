/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

/**
 *○ Deben definir sus constructores llamando obligatoriamente al constructor de la
clase base.
○ Paquete: Añade el atributo propio volumen (double).
 * @author Mario Betancor
 */
public class Paquete extends Envio {
    protected double volumen;
    String idSeguimiento;
    double peso;
    
    public Paquete(String idSeguimiento, double peso, double volumen){
            super();
            this.volumen = volumen;
    }
    
    @Override
    public double calcularPrecioFinal(){
       double precioBase = 5.0;
       for(){
           
       }
    }
}
