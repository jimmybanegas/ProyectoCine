package Menú;

import Peliculas.Pelicula;
import Peliculas.TipoClasificacion;
import Peliculas.TipoFormatoPeli;
import Peliculas.TipoPelicula;
import Salas.Sala;
import Salas.sala3D;
import Salas.TipoFormato;
import Salas.TipoSala;
import Usuarios.Usuario;
import java.util.ArrayList;

public class Menu {
   
    public static ArrayList<Usuario> users =new ArrayList<>();;
    public static ArrayList<Sala> salas=new ArrayList<>();
    public static ArrayList<Pelicula> peliculas=new ArrayList<>();  
 
    public static int contpeli=0;
    public static int contsala=0;
    
    public static void agregarUser(String nombre, String user, String pass){
        users.add( new Usuario(nombre, user, pass));
    }
    
    public static void agregarSalaNormal(int cod, TipoSala tipo,int filas, int asientos){      
         salas.add(new Sala(cod,tipo,filas,asientos));
         Menu.contsala+=1;
    }
    
    public static void agregarSala3D(int cod, TipoSala tipo,TipoFormato format, int filas, int asientos){
         salas.add( new sala3D(cod,tipo,format, filas,asientos));
         Menu.contsala+=1;
    }
    
    public static void agregarPelicula(int cod, String tit, double dur, TipoPelicula gen, TipoClasificacion clasif, TipoFormatoPeli formato){
        peliculas.add( new Pelicula(cod,tit,dur,gen,clasif, formato));
        Menu.contpeli+= 1;
    }
    
       
     public static void listaSalas(){
        for(Sala x:salas){
            System.out.println(x);
        }
    }
        
    
    public static boolean buscarUser(String user, String pass){
        for(Usuario x: users){
            if((x.getUser().equalsIgnoreCase(user))&&(x.getPass().equalsIgnoreCase(pass))){
                return true;
            }         
        }
        return false;
    }
    
}
