/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

/**
 *
 * Atributos solo accesibles desde las clases hija: idSeguimiento (String), peso
(double) y destino (un objeto de tipo Direccion).
 * @author Mario Betancor
 *     public String [] historialParadas = new String[3];
 */
public abstract class Envio {
    protected String idSeguimiento;
    protected double peso;

    
    public Envio(String idSeguimiento, double peso){
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
    }
    
    public abstract double calcularPrecioFinal();
    
}
