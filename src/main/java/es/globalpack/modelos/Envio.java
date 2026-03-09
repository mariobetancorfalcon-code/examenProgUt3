/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;
import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * Atributos solo accesibles desde las clases hija: idSeguimiento (String), peso
(double) y destino (un objeto de tipo Direccion).
 * @author Mario Betancor
 *     public String [] historialParadas = new String[3];
 */


public abstract class Envio {
    // Atributos protegidos para clases hijas [cite: 30]
    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;
    
    // Array con nivel de acceso a elección (public o package-private para el main) [cite: 31]
    public String[] historialParadas = new String[3];

    public Envio(String idSeguimiento, double peso, Direccion destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        // Inicialización obligatoria del array [cite: 32]
        for (int i = 0; i < historialParadas.length; i++) {
            historialParadas[i] = "Sin registro";
        }
    }

    // Método abstracto obligatorio [cite: 33]
    public abstract double calcularPrecioFinal();

    // Sobrescritura de equals por idSeguimiento [cite: 52]
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Envio other = (Envio) obj;
        return this.idSeguimiento.equals(other.idSeguimiento);
    }
}
