
package electrodomesticos;

/**
 *
 * @author J-CHAN
 */
public class Lavadora {
    private String marca;
    private String modelo;
    private String numeroSerie;
    private int capacidad;

    public Lavadora() {
    }

    public Lavadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void agregaRopa (int cantidad){
        System.out.println("Agregando ropa");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Lavadora {" + "marca= " + marca + " , modelo= " + modelo + " , numeroSerie= " + numeroSerie + " , capacidad= " + capacidad + '}';
    }
    
    
    
    
}
