
package entity;

import java.util.List;
/**
Autor:Floriceli Gonzalez Ruiz
Fecha creacion: 7 de marzo del 2022
Fecha actualizacion:7 de marzo del 2022
Descripcion:pagina de ejemplo
 */
public class Producto {
    private  String codigo;
  private  String model;
  private double precio;
  private  String descripcion;

    public Producto(String codigo, String model, double precio, String descripcion) {
        this.codigo = codigo;
        this.model = model;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String imprimir(){
    System.out.println("Codigo:"+codigo+"/nDescripcon:"+descripcion+"/nModelo:"+model+"/nPrecio:"+precio+"");
    return "";
    } 
    
    public static void main(String[] args) {
        Producto p1=new Producto();
        Producto p2=new Producto();
        Producto p3=new Producto();
        
        p1.setCodigo("R54G6");
        p1.setDescripcion("Telefono xiaomi");
        p1.setModel("XP4");
        p1.setPrecio(5.1);
        p1.imprimir();
        
        p2.setCodigo("P3H78");
        p2.setDescripcion("Telefono samsum");
        p2.setModel("Samsum 5");
        p2.setPrecio(5.1);
        p2.imprimir();
        
        p3.setCodigo("G9J39");
        p3.setDescripcion("Telefono umidigi");
        p3.setModel("A9 pro");
        p3.setPrecio(5.1);
        p3.imprimir();
        
        Usuario u1=new Usuario();
        Usuario u2=new Usuario();
        Usuario u3=new Usuario();
        
        u1.setCodigo(435);
        u1.setContrasena("123");
        u1.setNombre("Raul");
        u1.imprimir();
        
        u2.setCodigo(738);
        u2.setContrasena("321");
        u2.setNombre("Lucia");
        u2.imprimir();
        
        u3.setCodigo(354);
        u3.setContrasena("456");
        u3.setNombre("Armando");
        u3.imprimir();
        
        
        Persona pe1 =new Persona();
        Persona pe2 =new Persona();
        Persona pe3 =new Persona();
        
        
        pe1.setEdad(17);
        pe1.setNombre("Daniela");
        pe1.setSexo("Mujer");
        pe1.imprimir();
        
        pe2.setEdad(20);
        pe2.setNombre("jose");
        pe2.setSexo("Hombre");
        pe2.imprimir();
        
        pe3.setEdad(19);
        pe3.setNombre("Raul");
        pe3.setSexo("Hombre");
        pe3.imprimir();
    }

   
            
}
