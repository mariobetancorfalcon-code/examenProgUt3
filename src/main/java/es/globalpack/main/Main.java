/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.main;
 import es.globalpack.modelos.Paquete ;
 import es.globalpack.modelos.detalles.Direccion ;
/**
 * 
 * @author Mario Betancor
 */
public class Main {
    public class Principal {

        public static void main(String[] args) {
           
            Direccion dir = new Direccion("Calle Falsa 123", "35001", "Las Palmas");
            Paquete miPaquete = new Paquete("GP-999", 7.5, dir, 1.5);

            // 2. Registrar paradas 
            miPaquete.historialParadas[0] = "Madrid";
            miPaquete.historialParadas[1] = "Sevilla";

            
            System.out.println("Historial de paradas:");
            for (int i = 0; i < miPaquete.historialParadas.length; i++) {
                System.out.println("Parada " + i + ": " + miPaquete.historialParadas[i]);
            }

           
            System.out.println("Precio final: " + miPaquete.calcularPrecioFinal() + "€");
            System.out.println("Seguro (valor 100€): " + miPaquete.calcularSeguro(100.0) + "€");
        }
    }
}
