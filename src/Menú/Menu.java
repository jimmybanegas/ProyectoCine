package Menú;

import Peliculas.Pelicula;
import Peliculas.TipoClasificacion;
import Peliculas.TipoFormatoPeli;
import Peliculas.TipoPelicula;
import Salas.Sala;
import Salas.TipoFormato;
import Salas.TipoSala;
import Salas.sala3D;
import Usuarios.Usuario;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Menu {
   
    public static ArrayList<Usuario> users =new ArrayList<>();;
    public static ArrayList<Sala> salas=new ArrayList<>();
    public static ArrayList<Pelicula> peliculas=new ArrayList<>();  
 
    public static int contpeli=0;
    public static int contsala=0;
    
    public static void agregarUser(String nombre, String user, String pass){
        users.add( new Usuario(nombre, user, pass));
    }
    
    public static void agregarSalaNormal(int cod, TipoSala tipo,int filas, int asientos, JPanel sillas){      
         salas.add(new Sala(cod,tipo,filas,asientos,sillas));
         Menu.contsala+=1;
    }
    
    public static void agregarSala3D(int cod, TipoSala tipo,TipoFormato format, int filas, int asientos, JPanel sillas){
         salas.add( new sala3D(cod,tipo,format, filas,asientos,sillas));
         Menu.contsala+=1;
    }
    
    public static void agregarPelicula(int cod, String tit, double dur, TipoPelicula gen, TipoClasificacion clasif, TipoFormatoPeli formato,String imagen){
        peliculas.add( new Pelicula(cod,tit,dur,gen,clasif, formato,imagen));
        Menu.contpeli+= 1;
    }
    
       
     public static void listaSalas(){
        for(Sala x:salas){
            System.out.println(x);
        }
    }
        
    
    public static boolean buscarUser(String user, String pass){
        for(Usuario x: users){
            if((x.getUser().equalsIgnoreCase(user))&&(x.getPass().equalsIgnoreCase(pass))&&(x.isCredencial())){
                return true;
            }         
        }
        return false;
    }
    
     public static boolean buscarUser2(String user){
        for(Usuario x: users){
            if((x.getUser().equalsIgnoreCase(user))&&(x.isCredencial())){
                return true;
            }         
        }
        return false;
    }
    
    
    
}
