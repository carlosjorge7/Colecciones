package productos_ventas;

public class Venta {
    
    private double precio;
    private int unidades;
    private double importe;

    public Venta(double precio, int unidades, double importe) {
        this.precio = precio;
        this.unidades = unidades;
        this.importe = importe;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getImporte(){
        return importe;
    }

}