
package Salas;

import javax.swing.JPanel;

public class sala3D extends Sala{
    protected TipoFormato format;       
    
    public sala3D(int cod, TipoSala tipo, TipoFormato format,int filas, int asientos, JPanel sillas ){
        super(cod,tipo,filas,asientos,sillas);
        this.format=format;
        
        if(format==TipoFormato.DIGITAL){
            this.setPrecio(90);
        }
        if((format==TipoFormato.REAL)||(format==TipoFormato.EXTREME)){
               this.setPrecio(110);
        }
    }

    public TipoFormato getFormat() {
        return format;
    }        
    
    
}
