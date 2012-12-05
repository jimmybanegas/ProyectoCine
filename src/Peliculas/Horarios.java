/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Affisa-Jimmy
 */
public class Horarios {
    protected int codSala;
    protected int codPel;
    protected Date inicio;
    protected Date fina;
    
    
    
    public Horarios(int codSala, int codPel, Date inicio, Date fina){
        this.codSala=codSala;
        this.codPel=codPel;
        this.inicio=inicio;
        this.fina=fina;
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

    public Date getFina() {
        return fina;
    }
    
    
    
    
}
