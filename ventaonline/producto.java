
package ventaonline;

/**
 *
 * @author J-CHAN
 */
public class producto {
    private String nombre;
    private int unidades;
    private int precio;
    private String descripcion;

    public producto() {
    }
    
    public producto(String nombre, int unidades) {
        this.nombre= nombre;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString2() {
        return "Producto {" + "Nombre= " + nombre + ", Unidades Compradas= " + unidades + ", Precio= $" + precio + ", Descrición= " + descripcion + '}';
    }
    
    

}
