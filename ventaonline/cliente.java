
package ventaonline;

/**
 *
 * @author J-CHAN
 */
public class cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private int codigPostal;

    public cliente() {
    }
    
    public cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodigPostal() {
        return codigPostal;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigPostal(int codigPostal) {
        this.codigPostal = codigPostal;
    }
    
    @Override
    public String toString() {
        return "Cliente {" + "ID= " + idCliente + ", Nombre= " + nombre + ", Dirección= " + direccion + ", Codigo Postal= " + codigPostal + '}';
    }
    
}
