/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.Date;

/**
 *
 * @author Affisa-Jimmy
 */
public class Horarios {
    protected int codHorario;
    protected int codSala;
    protected int codPel;
    protected String tit;
    protected Date inicio;
    protected Date fina;    
    protected int fil;
    protected int col;
    protected boolean[][] sillas;
    
    public Horarios(int codHorario, int codSala, int codPel, String tit,Date inicio, Date fina,int fil, int col, boolean[][] sillas){
        this.codHorario=codHorario;
        this.codSala=codSala;
        this.codPel=codPel;
        this.tit=tit;
        this.inicio=inicio;
        this.fina=fina;
        this.fil=fil;
        this.col=col;
        this.sillas=sillas;
    }

    public String getTit() {
        return tit;
    }

    public int getCodSala() {
        return codSala;
    }

    public int getCodPel() {
        return codPel;
    }

    public Date getInicio() {
        return inicio;
    }

    public int getCodHorario() {
        return codHorario;
    }

    public Date getFina() {
        return fina;
    }

    public int getFil() {
        return fil;
    }

    public int getCol() {
        return col;
    }

    public boolean[][] getSillas() {
        return sillas;
    }
    
    
    
    @Override
    public String toString(){
        return "Sala: "+codSala+" Pelicula: "+codPel+" Título: "+tit+" Inicio: "+inicio+ " Fin: "+fina;
    } 
    
    
}
