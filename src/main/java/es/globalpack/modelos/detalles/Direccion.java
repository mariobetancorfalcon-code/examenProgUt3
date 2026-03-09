/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos.detalles;

/*
 *
 * @author Mario Betancor
 */
public class Direccion {
    //Atributos
    protected String calle;
    protected int codigoPostal;
    protected String ciudad;
    
    public Direccion(String calle, int codigoPostal, String ciudad){
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
    
    // Getter para la ciudad (necesario para la lógica de Sobre) [cite: 49]
    public String getCiudad() {
        return ciudad;
    }
    
    //tostring
    @Override
    public String toString(){
        return "Calle: " + calle + ". Codigo postal: " + codigoPostal + ". Ciudad:" + ciudad;
    }
}
    

