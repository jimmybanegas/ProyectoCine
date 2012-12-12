
package Usuarios;

public class Usuario {
 
    protected String nombre;
    protected String user;
    protected String pass;
    protected boolean credencial;
    protected long pos;
    
    public Usuario(String nombre, String user, String pass, long pos){
        this.nombre=nombre;
        this.user=user;
        this.pass=pass;
        this.pos=pos;
        credencial=true;        
    }

    public boolean isCredencial() {
        return credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

    public long getPos() {
        return pos;
    }
    
    @Override
     public String toString(){
        return "Nombre: "+nombre+" Usuario: "+user+" Password: "+pass;
    }
    
    
}
