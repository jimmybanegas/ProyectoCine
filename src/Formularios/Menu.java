package Formularios;

import Peliculas.Pelicula;
import Peliculas.TipoClasificacion;
import Peliculas.TipoPelicula;
import Salas.Sala;
import Salas.TipoFormato;
import Salas.TipoSala;
import Salas.sala3D;
import Usuarios.Usuario;
import java.util.ArrayList;
import javax.swing.JLabel;

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
    
    public static void agregarPelicula(int cod, String tit, double dur, TipoPelicula gen, TipoClasificacion clasif){
        peliculas.add( new Pelicula(cod,tit,dur,gen,clasif));
        Menu.contpeli+= 1;
    }
    
    public static void listaUsers(){
        for(Usuario x:users){
            System.out.println(x);
        }
    }           
 
    
     public static void listaSalas(){
        for(Sala x:salas){
            System.out.println(x);
        }
    }
     
     public static void listaPeliculas(){
        for(Pelicula x:peliculas){
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
