/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

/**
 *
 * @author Auditor3
 */
public class Sala {
   
    protected int cod;
    protected TipoSala tipo;
    protected int filas;
    protected int asientos;
    protected double precio;
    
    
    public Sala(int cod,TipoSala tipo,int filas, int asientos){
        this.cod=cod;
        this.tipo=tipo;
        this.filas=filas;
        this.asientos=asientos;
        this.precio=70;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

       
    public int getAsientos() {
        return asientos;
    }

    public int getCod() {
        return cod;
    }

    public int getFilas() {
        return filas;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoSala getTipo() {
        return tipo;
    }
    
    @Override
     public String toString(){
        return "Codigo: "+cod+" Tipo: "+tipo+" Precio: "+precio;
    }
    
}
