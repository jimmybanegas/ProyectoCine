
package Salas;

public class Sala {

    protected int cod;
    protected TipoSala tipo;
    protected int filas;
    protected int columnas;
    protected double precio;
    protected boolean sillas[][];
    
    
    public Sala(int cod,TipoSala tipo,int filas, int asientos, boolean sillas[][]){
        this.cod=cod;
        this.tipo=tipo;
        this.filas=filas;
        this.columnas=asientos;
        this.sillas=sillas;      
        this.precio=70;
       
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAsientos() {
        return columnas;
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

    public boolean[][] getSillas() {
        return sillas;
    }    
    
    
    @Override
     public String toString(){
             return "Codigo: "+cod+" Tipo: "+tipo+" Precio: "+precio;
    }
    
}
