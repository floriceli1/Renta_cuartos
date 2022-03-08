
package entity;

/**
Autor:Floriceli Gonzalez Ruiz
Fecha creacion: 7 de marzo del 2022
Fecha actualizacion:7 de marzo del 2022
Descripcion:pagina de ejemplo
 */
public class Persona {
    private String nombre;
    private String sexo;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public String imprimir(){
    System.out.println("Nombre:"+nombre+"/nSexo:"+sexo+"/nEdad:"+edad+"");
    return "";
    }
}
