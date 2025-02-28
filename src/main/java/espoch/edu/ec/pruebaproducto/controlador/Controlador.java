package espoch.edu.ec.pruebaproducto.controlador;

import espoch.edu.ec.pruebaproducto.modelo.GestionProducto;
import espoch.edu.ec.pruebaproducto.modelo.Producto;
import espoch.edu.ec.pruebaproducto.vista.IuVista;

/**
 *
 * @author and_j
 */
public class Controlador {

    private IuVista objIuVista;
    private Producto objProducto;
    private GestionProducto objGestionProducto;
    private Controlador objControlador;
    Producto[] vectproducto = new Producto[20];

    public void Controlador() {
        this.objIuVista = objIuVista;
        this.objProducto = new Producto();
        this.objGestionProducto = new GestionProducto();
    }

    public void setagregarProducto() {

        String Nombre = objIuVista.getNombreProducto();
        String Precio = objIuVista.getPrecioProducto();
        boolean Estado;
        //Estado = String.valueOf(objIuVista.isEstado());
        //Estado = String.valueOf(objIuVista.isEstado());
        //Estado = objIuVista.isEstado();
        for (int i = 0; i < 20; i++) {
            if (vectproducto == null) {
                vectproducto[i] = new Producto();
                vectproducto[i].getNombre();
                vectproducto[i].getPrecio();
                vectproducto[i].isEstado();
                break;
            }
        }
    }
    

    

    public void mostrarProducto() {
        System.out.println("Los Productos son los siguientes");
        for (int i = 0; i < 20; i++) {
            if (vectproducto[i] != null) {
                String Nombre = vectproducto[i].getNombre();
                double Precio = vectproducto[i].getPrecio();
                //boolean = vectproducto[i].isEstado();
            }
        }

    }
}

    /* private Producto Producto() {
        throw new UnsupportedOperationException("Not supported yet."); */
