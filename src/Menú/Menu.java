package Menú;

import Peliculas.Horarios;
import Peliculas.Pelicula;
import Peliculas.TipoClasificacion;
import Peliculas.TipoFormatoPeli;
import Peliculas.TipoPelicula;
import Salas.TipoFormato;
import Salas.TipoSala;
import Usuarios.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Menu {
     
     public static  RandomAccessFile users ;
     public static  RandomAccessFile salas ;
     public static  RandomAccessFile peliculas ;
     public static  RandomAccessFile horarios ;
     public static String usuario;

   
     public Menu() throws FileNotFoundException{
         File u=new File("Usuarios");
         u.mkdir(); 
         users = new RandomAccessFile( new File("Usuarios\\cinefilos.movi"), "rw");
     }
    
    public static void agregarUser(String nombre, String user, String pass) throws FileNotFoundException, IOException{
        users.seek(users.length());        
        users.writeUTF(nombre);
        users.writeUTF(user);
        users.writeUTF(pass);
        users.writeBoolean(true);      
            
    }
    
    public static void agregarSalaNormal(int cod, TipoSala tipo,int fil, int col, boolean sillas[][]) throws FileNotFoundException, IOException{      
        File u=new File("Salas");
        u.mkdir();     
        Menu.salas= new RandomAccessFile( new File("Salas\\sala"+cod+".movi"), "rw");     
     
        salas.seek(salas.length());
        
        salas.writeInt(cod);
        salas.writeUTF(tipo.toString());
        salas.writeUTF(" ");
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
        
        File h=new File("Horarios");
        h.mkdir();  
        
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+cod+".movi"), "rw"); 
     
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
         
        File h=new File("Horarios");
        h.mkdir();  
        
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+cod+".movi"), "rw");  
      
    }
    
    public static void agregarPelicula(int cod, String tit, int hor, int min, TipoPelicula gen, TipoClasificacion clasif, TipoFormatoPeli formato,String imagen) throws FileNotFoundException, IOException{
        File u=new File("Peliculas");
        u.mkdir();     
        Menu.peliculas= new RandomAccessFile( new File("Peliculas\\peliculas.movi"), "rw");   
   
        peliculas.seek(peliculas.length());
       
        peliculas.writeInt(cod);
        peliculas.writeInt(hor);
         peliculas.writeInt(min);
        peliculas.writeUTF(tit);
        peliculas.writeUTF(gen.toString());
        peliculas.writeUTF(clasif.toString());
        peliculas.writeLong( new Date().getTime());//Escribo la fecha
        peliculas.writeUTF(formato.toString());
        peliculas.writeUTF(imagen); 
      
    }
          
    
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
           JOptionPane.showMessageDialog(null, "Error"); 
        }
        return false;
    }   
     
     public static Usuario getDatos(String user) throws FileNotFoundException{
         File u=new File("Usuarios");
         u.mkdir();     
         Menu.users= new RandomAccessFile( new File("Usuarios\\cinefilos.movi"), "rw");
         
       try{
        users.seek(0);       
        while(users.getFilePointer() < users.length() ){      
            String nombre= users.readUTF();
            String use=  users.readUTF();
            String pas= users.readUTF();
            long pos=users.getFilePointer();
            boolean ac= users.readBoolean();  
           
            if(ac==true&&user.equalsIgnoreCase(use)){           
              return new Usuario(nombre,use,pas,pos);
           }  
         }        
        }
        catch(IOException e){
           JOptionPane.showMessageDialog(null, "Error"); 
        }      
         
        return null;
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
           JOptionPane.showMessageDialog(null, "Error"); 
        }
        return false;
         
       
    }
    
     
    public static void addPeliHorario(int codHorario,int codSala, int codPeli,String tit,Date in, Date fin, boolean activa) throws FileNotFoundException, IOException {
        File u=new File("Horarios");
        u.mkdir();  
       
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+codSala+".movi"), "rw");
      
        horarios.seek(horarios.length());
        horarios.writeInt(codHorario);
        horarios.writeInt(codSala);
        horarios.writeInt(codPeli);
        horarios.writeUTF(tit);
        horarios.writeLong(in.getTime());
        horarios.writeLong(fin.getTime());        
        horarios.writeBoolean(activa);
    }
    
   public static Pelicula getPeli(int cod) throws FileNotFoundException{
        File u=new File("Peliculas");
        u.mkdir();     
        Menu.peliculas= new RandomAccessFile( new File("Peliculas\\peliculas.movi"), "rw");   
       try{
        peliculas.seek(0);
        while(peliculas.getFilePointer() < peliculas.length() ){
      
            int co=peliculas.readInt();//Codigo
            int hor= peliculas.readInt();//Duracion horas
            int min= peliculas.readInt();//Duracion minutos
            String tit= peliculas.readUTF();//Titulo nombre
            String ti= peliculas.readUTF();//TipoPelicula Genero
            String cla=peliculas.readUTF();//TipoClasificacion
            long fecha=peliculas.readLong();//Fecha de adicion
            String fo= peliculas.readUTF();//TipoFormato 3D/Normal
            String ima=peliculas.readUTF(); //Path de imagen
              
              if( cod == co ){            
                  return new Pelicula(co,tit,hor,min,TipoPelicula.valueOf(ti),TipoClasificacion.valueOf(cla),new Date(fecha),TipoFormatoPeli.valueOf(fo),ima)  ;
              } 
          }  
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error"); 
        }
      
      return null;
    }
    
   public static Pelicula getPeliNom(String nombre) throws FileNotFoundException{
        File u=new File("Peliculas");
        u.mkdir();     
        Menu.peliculas= new RandomAccessFile( new File("Peliculas\\peliculas.movi"), "rw");   
       try{
        peliculas.seek(0);
        while(peliculas.getFilePointer() < peliculas.length() ){
      
            int co=peliculas.readInt();//Codigo
            int hor= peliculas.readInt();//Duracion horas
            int min= peliculas.readInt();//Duracion minutos
            String tit= peliculas.readUTF();//Titulo nombre
            String ti= peliculas.readUTF();//TipoPelicula Genero
            String cla=peliculas.readUTF();//TipoClasificacion
            long fecha=peliculas.readLong();//Fecha de adicion
            String fo= peliculas.readUTF();//TipoFormato 3D/Normal
            String ima=peliculas.readUTF(); //Path de imagen
              
              if( nombre.equalsIgnoreCase(tit) ){            
                  return new Pelicula(co,tit,hor,min,TipoPelicula.valueOf(ti),TipoClasificacion.valueOf(cla),new Date(fecha),TipoFormatoPeli.valueOf(fo),ima)  ;
              } 
          }  
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error"); 
        }
      
      return null;
    }
   
   public static ArrayList<Horarios> getHorario(int cod) throws FileNotFoundException{
        File u=new File("Horarios");
        u.mkdir();     
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+cod+".movi"), "rw");
        ArrayList <Horarios> pelis=new ArrayList<>(); 
       try{
        horarios.seek(0);
        while(horarios.getFilePointer() < horarios.length() ){      
            int codHorario=horarios.readInt();
            int codSala=horarios.readInt();
            int codPeli=horarios.readInt();
            String tit= horarios.readUTF();
            long ini = horarios.readLong();
            long fin=horarios.readLong();  
            boolean activa=horarios.readBoolean();   
        
           if(activa==true){           
             pelis.add( new Horarios(codHorario, codSala, codPeli, tit, new Date(ini), new Date(fin)));
           }  
          }
         return pelis;
        }
        catch(IOException e){
           JOptionPane.showMessageDialog(null, "Error"); 
        }
      
      return null;
    }
   
   public static Date horaInicial(int cod) throws FileNotFoundException, IOException{
        File u=new File("Horarios");
        u.mkdir();     
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+cod+".movi"), "rw");
        horarios.seek(0);
       
        Date inicio=new Date();       
              
        while(horarios.getFilePointer() < horarios.length()){
            horarios.readInt();
            horarios.readInt();
            horarios.readInt();
            horarios.readUTF();
            long ini = horarios.readLong();
            horarios.readLong();  
            boolean activ=horarios.readBoolean();   
            
            
            if( activ==true){
                if( inicio.getTime()>ini) {
                      inicio.setTime(ini);                    
                }
            }
        
         }
     
       return inicio;
   }
   
    public static Date horaFinal(int cod) throws FileNotFoundException, IOException{
       File u=new File("Horarios");
        u.mkdir();     
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+cod+".movi"), "rw");
        horarios.seek(0);
    
      
        long f=0;
        while(horarios.getFilePointer() < horarios.length()){
            horarios.readInt();
            horarios.readInt();
            horarios.readInt();
            horarios.readUTF();
            horarios.readLong();
            long fin=horarios.readLong();  
            boolean activ=horarios.readBoolean();  
                      
        if( activ){
           if(f==0) { 
            if(fin<f){ 
                 f=fin;   
             } 
           }else if(f!=0){
             if(fin>f){ 
                 f=fin;   
             } 
           }
           
         }
         }
        Date ff=new Date(f);
       
       return ff; 
    
   }

    public static String getUsuario() {
        return usuario;
    }
 
    
}
