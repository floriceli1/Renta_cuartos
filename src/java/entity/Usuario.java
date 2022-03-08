
package entity;

/**
Autor:Floriceli Gonzalez Ruiz
Fecha creacion: 5 de marzo del 2022
Fecha actualizacion:7 de marzo del 2022
Descripcion:pagina de ejemplo
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String contrasena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
   public String imprimir(){
    System.out.println("Nombre:"+nombre+"/nCodigo:"+codigo+"/nContraseña:"+contrasena+"");
    return"";
    }
    
}
