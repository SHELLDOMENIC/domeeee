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
    //Producto[] vectproducto = new Producto[20];

    public Controlador() {
    }

    public Controlador(IuVista objIuVista, Producto objProducto, GestionProducto objGestionProducto) {
        this.objIuVista = objIuVista;
        this.objProducto = objProducto;
        this.objGestionProducto = objGestionProducto;
    }
 
    
    public void Controlador(IuVista objIuVista) {
        this.objIuVista = objIuVista;
        this.objProducto = new Producto();
        this.objGestionProducto = new GestionProducto();
        //this.objControlador = new Controlador();
    }

    public String setagregarProducto(Controlador objControlador) {

        String Nombre = objIuVista.getNombreProducto();
        String Precio = objIuVista.getPrecioProducto();
        String Estado;

        objProducto.setNombre(Nombre);
        objProducto.setPrecio(0);
        objProducto.setEstado(true);
        Estado = String.valueOf(objIuVista.isEstado());
        String result = String.valueOf(objProducto);
        //result = String.valueOf(objOperaciones.agregarVectorSuma(objsuma));
        
       
        objIuVista.respuesta(result);
        System.out.println("los valores añadidos son"+result);

        return result;
    }

    public void mostrarProducto() {
        System.out.println("Los Productos son los siguientes");
        /**/
        /* for (int i = 0; i < 20; i++) {
            if (vectproducto[i] != null) {
                String Nombre = vectproducto[i].getNombre();
                double Precio = vectproducto[i].getPrecio();
                //boolean = vectproducto[i].isEstado();*/
    }
}

/* private Producto Producto() {
        throw new UnsupportedOperationException("Not supported yet."); */
