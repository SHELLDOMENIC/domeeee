package espoch.edu.ec.pruebaproducto.modelo;

/**
 *
 * @author and_j
 */
public class GestionProducto {

    Producto[] vecProducto = new Producto[20];

    private String Producto(String nombre, double precio, boolean Estado) {
        String Nombre;
        double Precio;
      return "";  
    }

    public void agregarVectorProducto(Producto objProducto) {
        String result;
        for (int i = 0; i < 20; i++) {
            if (vecProducto[i] == null) {
                vecProducto[i] = new Producto();
               // result = Producto(objProducto.getNombre(), objProducto.getPrecio(), objProducto.isEstado());
                vecProducto[i].setNombre(objProducto.getNombre());
                vecProducto[i].setPrecio(objProducto.getPrecio());
                vecProducto[i].setEstado(true);
                Producto.add(new Producto(objProducto.getNombre(), objProducto.getPrecio(), objProducto.isEstado()));
   
                break;
            }

        }
       
    }

    public String  ListarProductos(Producto objProducto) {
        String Producto1 = "";
        for (int i = 0; i < 20; i++) {
            if (vecProducto[i] != null) {
                  Producto1 = Producto(objProducto.getNombre(), objProducto.getPrecio(), objProducto.isEstado());
                
            }

        }
        
        return ("Los Productos son" + Producto1);
                

    }

}
