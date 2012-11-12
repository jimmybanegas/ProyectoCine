/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

/**
 *
 * @author Auditor3
 */
public class sala3D extends Sala{
    protected TipoFormato format;
       
    
    public sala3D(int cod, TipoSala tipo, int filas, int asientos, TipoFormato format){
        super(cod,tipo,filas,asientos);
        this.format=format;
        
        if(format==TipoFormato.DIGITAL){
            this.precio=90;
        }
        else if((format==TipoFormato.REAL)&&(format==TipoFormato.EXTREME)){
            this.precio=110;
        }
    }
    
    
    
    
}
