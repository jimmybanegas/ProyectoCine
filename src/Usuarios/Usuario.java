
package Usuarios;

public class Usuario {
 
    protected String nombre;
    protected String user;
    protected String pass;
    protected boolean credencial;
    
    public Usuario(String nombre, String user, String pass){
        this.nombre=nombre;
        this.user=user;
        this.pass=pass;
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
    
    @Override
     public String toString(){
        return "Nombre: "+nombre+" Usuario: "+user+" Password: "+pass;
    }
    
    
}
