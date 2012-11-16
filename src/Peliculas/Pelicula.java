
package Peliculas;

import java.util.Date;

public class Pelicula {
    protected int cod;
    protected String titulo;
    protected double dura;
    protected TipoPelicula genero;
    protected TipoClasificacion clasi;
    protected TipoFormatoPeli formato;
    protected Date fecha;
    protected String imagen;
    
    public Pelicula(int cod, String titulo, double dura, TipoPelicula genero, TipoClasificacion clasi,TipoFormatoPeli formato,String imagen){
        this.cod=cod;
        this.titulo=titulo;
        this.dura=dura;
        this.genero=genero;
        this.clasi=clasi;
        this.formato=formato;
        this.imagen=imagen;
        fecha=new Date();
    }

    public TipoClasificacion getClasi() {
        return clasi;
    }

    public int getCod() {
        return cod;
    }

    public double getDura() {
        return dura;
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
        return "Codigo: "+cod+" Titulo: "+titulo+" Duracion: "+dura;
    }
    
}
