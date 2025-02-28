
package espoch.edu.ec.pruebaproducto.modelo;

/**
 *
 * @author and_j
 */
public class Producto {

    static void add(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private String Nombre;
    private double Precio;
    private boolean Estado;

    public Producto() {
    }

    public Producto(String Nombre, double Precio, boolean Estado) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Estado = Estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
