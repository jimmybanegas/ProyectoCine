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
   
    static ArrayList<Usuario> users =new ArrayList<>();;
    static ArrayList<Sala> salas=new ArrayList<>();
    static ArrayList<Pelicula> peliculas=new ArrayList<>();  
    private static JLabel JLabel;
    
    public static void agregarUser(String nombre, String user, String pass){
        users.add( new Usuario(nombre, user, pass));
    }
    
    public static void agregarSala(int cod, TipoSala tipo,int filas, int asientos){
        if (tipo==TipoSala.NORMAL){
            salas.add(new Sala(cod,tipo,filas,asientos));
        }
        else if(tipo==TipoSala.SALA3D){
            String format="";
            salas.add( new sala3D(cod,tipo,filas,asientos,TipoFormato.valueOf(format)));
        }
    }
    
    public static void agregarPelicula(int cod, String tit, double dur, TipoPelicula gen, TipoClasificacion clasif){
        peliculas.add( new Pelicula(cod,tit,dur,gen,clasif));
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
    
    
    
}
