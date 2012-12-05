
package Peliculas;

import java.util.Date;

public class Pelicula {
    protected int cod;
    protected String titulo;
    protected int hrs;
    protected int min;
    protected TipoPelicula genero;
    protected TipoClasificacion clasi;
    protected TipoFormatoPeli formato;
    protected Date fecha;
    protected String imagen;
    
    public Pelicula(int cod, String titulo, int hrs,int min, TipoPelicula genero, TipoClasificacion clasi,Date fe,TipoFormatoPeli formato,String imagen){
        this.cod=cod;
        this.titulo=titulo;
        this.hrs=hrs;
        this.min=min;
        this.genero=genero;
        this.clasi=clasi;
        this.formato=formato;
        this.fecha=fe;
        this.imagen=imagen;
       
    }

    public TipoClasificacion getClasi() {
        return clasi;
    }

    public int getCod() {
        return cod;
    }

    public int getHoras() {
        return hrs;
    }
    
     public int getMinutos() {
        return min;
    }

    public Date getFecha() {
        return fecha;
    }

    public TipoPelicula getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoFormatoPeli getFormato() {
        return formato;
    }

    public String getImagen() {
        return imagen;
    }
    
    
    @Override
    public String toString(){
        return "Codigo: "+cod+" Titulo: "+titulo+" Duracion: "+hrs+":"+min;
    }
    
}
