
package electrodomesticos;

/**
 *
 * @author J-CHAN
 */
public class Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Lavadora lav10k = new Lavadora();
    lav10k.setMarca("Mabe");
    lav10k.setModelo("Centrifugado xm61");
    lav10k.setNumeroSerie("12552fss");
    lav10k.setCapacidad(10);
   
        System.out.println(lav10k.toString());
    }
}
