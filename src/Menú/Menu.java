package Menú;

import Peliculas.TipoClasificacion;
import Peliculas.TipoFormatoPeli;
import Peliculas.TipoPelicula;
import Salas.TipoFormato;
import Salas.TipoSala;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Menu {
   
  //  public static ArrayList<Usuario> users =new ArrayList<>();;
  //  public static ArrayList<Sala> salas=new ArrayList<>();
 //   public static ArrayList<Pelicula> peliculas=new ArrayList<>();  
    
     public static  RandomAccessFile users;
     public static  RandomAccessFile salas ;
     public static  RandomAccessFile peliculas ;
 
  //  public static int contpeli=codPeli();
 //   public static int contsala=codSala();
    
    public static void agregarUser(String nombre, String user, String pass) throws FileNotFoundException, IOException{
        File u=new File("Usuarios");
        u.mkdir();     
       
        Menu.users = new RandomAccessFile( new File("Usuarios\\cinefilos.movi"), "rw");
        
        users.seek(users.length());        
        users.writeUTF(nombre);
        users.writeUTF(user);
        users.writeUTF(pass);
        users.writeBoolean(true);
      //  users.add( new Usuario(nombre, user, pass));            
            
    }
    
    public static void agregarSalaNormal(int cod, TipoSala tipo,int fil, int col, boolean sillas[][]) throws FileNotFoundException, IOException{      
        File u=new File("Salas");
        u.mkdir();     
        Menu.salas= new RandomAccessFile( new File("Salas\\sala"+cod+".movi"), "rw");     
     
        salas.seek(salas.length());
        
        salas.writeInt(cod);
        salas.writeUTF(tipo.toString());
        salas.writeUTF("");
        salas.writeInt(fil);
        salas.writeInt(col);
      
        for(int x=0;x<fil;x++){          
             for(int y=0;y<col;y++){    
               if(sillas[x][y]){
                   salas.writeBoolean(true);
               }
               else if(sillas[x][y]==false){
                   salas.writeBoolean(false);
               }
             } 
        }
        //  salas.add(new Sala(cod,tipo,filas,asientos,sillas));
       
        
       // Menu.contsala+=1;
    }
    
    public static void agregarSala3D(int cod, TipoSala tipo,TipoFormato format, int fil, int col, boolean sillas[][]) throws FileNotFoundException, IOException{
         File u=new File("Salas");
         u.mkdir();     
        Menu.salas= new RandomAccessFile( new File("Salas\\sala"+cod+".movi"), "rw");     
  
        salas.seek(salas.length());
        
        salas.writeInt(cod);
        salas.writeUTF(tipo.toString());
        salas.writeUTF(format.toString());
        salas.writeInt(fil);
        salas.writeInt(col);
        
         for(int x=0;x<fil;x++){          
             for(int y=0;y<col;y++){    
               if(sillas[x][y]){
                   salas.writeBoolean(true);
               }
               else if(sillas[x][y]==false){
                   salas.writeBoolean(false);
               }
             } 
        }
        //     salas.add( new sala3D(cod,tipo,format, filas,asientos,sillas));
       //  Menu.contsala+=1;
    }
    
    public static void agregarPelicula(int cod, String tit, double dur, TipoPelicula gen, TipoClasificacion clasif, TipoFormatoPeli formato,String imagen) throws FileNotFoundException, IOException{
        File u=new File("Peliculas");
        u.mkdir();     
        Menu.peliculas= new RandomAccessFile( new File("Peliculas\\sala"+cod+".movi"), "rw");   
   
        peliculas.seek(peliculas.length());
       
        peliculas.writeInt(cod);
        peliculas.writeDouble(dur);
        peliculas.writeUTF(gen.toString());
        peliculas.writeUTF(clasif.toString());
        peliculas.writeUTF(formato.toString());
        peliculas.writeUTF(imagen); 
        //   peliculas.add( new Pelicula(cod,tit,dur,gen,clasif, formato,imagen));
     //   Menu.contpeli+= 1;
    }
    
    
    
    
  /*   public static void listaSalas(){
        for(Sala x:salas){
            System.out.println(x);
        }
    }*/
        
    
    public static boolean buscarUser(String user, String pass){
       try{
            users.seek(0);
            
           while(users.getFilePointer() < users.length() ){
            
             users.readUTF();
             String us= users.readUTF();
             String pas=users.readUTF();
             boolean act= users.readBoolean();
                
                
                if(( user.equals(us))&&(pass.equals(pas))&&(act)){
                    return true;
                }                
               
            }
        }
        catch(IOException e){
            System.out.println("ERROR");
        }
        return false;
        
     /*   for(Usuario x: users){
            if((x.getUser().equalsIgnoreCase(user))&&(x.getPass().equalsIgnoreCase(pass))&&(x.isCredencial())){
                return true;
            }         
        }
        return false;*/
    }
    
     public static boolean buscarUser2(String user){
        try{
            users.seek(0);
            
           while(users.getFilePointer() < users.length() ){
            
             users.readUTF();
             String us= users.readUTF();
             users.readUTF();
             boolean act= users.readBoolean();
                
                
                if(( user.equals(us))&&(act)){
                    return true;
                }                
               
            }
        }
        catch(IOException e){
            System.out.println("ERROR");
        }
        return false;
         
         /* for(Usuario x: users){
            if((x.getUser().equalsIgnoreCase(user))&&(x.isCredencial())){
                return true;
            }         
        }
        return false;*/
    }
    
    
    
}
