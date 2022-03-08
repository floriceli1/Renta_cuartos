
package db;

import java.sql.Connection;

/**
Autor:Floriceli Gonzalez Ruiz
Fecha creacion: 5 de marzo del 2022
Fecha actualizacion:7 de marzo del 2022
Descripcion:pagina de ejemplo
 */
public class Conexion {
    
    final private Connection conection;
    final private String url;
    final private String user;
    final private String pwd;

    public Conexion(Connection conection, String url, String user, String pwd) {
        this.conection = conection;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

   

    
    
    
   public Connection conectar(){
       

       return conection;
   }   
    
   
   public Connection desconectar(){
       
       return conection;
   }  

    public Connection getConection() {
        
        return conection;
    }
   
    public static void main(String[] args) {
        
    }
   
   
}
