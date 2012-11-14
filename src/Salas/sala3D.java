
package Salas;

public class sala3D extends Sala{
    protected TipoFormato format;       
    
    public sala3D(int cod, TipoSala tipo, TipoFormato format,int filas, int asientos ){
        super(cod,tipo,filas,asientos);
        this.format=format;
        
        if(format==TipoFormato.DIGITAL){
            this.precio=90;
        }
        else if((format==TipoFormato.REAL)&&(format==TipoFormato.EXTREME)){
            this.precio=110;
        }
    }

    public TipoFormato getFormat() {
        return format;
    }
    
    
    
    
}
