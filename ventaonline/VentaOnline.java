
package ventaonline;

/**
 *
 * @author J-CHAN
 */
public class VentaOnline {

    public static void main(String[] args) {
        
        cliente cliente01 = new cliente();
        cliente01.setIdCliente(0001);
        cliente01.setNombre("Fernando");
        cliente01.setDireccion("AV. INDEPENDENCIA NO. 241" );
        cliente01.setCodigPostal(24910);
        
        System.out.println(cliente01.toString());
        System.out.println("-----------------------------------------------");
        
        producto prod01 = new producto();
        prod01.setNombre("Hamaca quinsay");
        prod01.setUnidades(01);
        prod01.setPrecio(1400);
        prod01.setDescripcion("Hamaca yucateca artezanal realizada a base de hilos");
        
        System.out.println(prod01.toString2());
    
    }
    
}
