/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

/**
 *
 * @author Auditor3
 */
public class MiSeleccion {
    protected String titulo;
    protected String[] horas;
    protected String genero;
    protected String duracion;
    protected String clasif;
    
    public MiSeleccion(String tit, String[] horas, String genero,String duracion,String clasif){
        this.titulo=tit;
        this.horas=horas;
        this.genero=genero;
        this.duracion=duracion;
        this.clasif=clasif;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getHoras() {
        return horas;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getClasif() {
        return clasif;
    }
    
    
            
    
    
}
