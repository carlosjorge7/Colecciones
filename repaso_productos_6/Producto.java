package repaso_productos_6;

public class Producto {

    private String nombre;
    private int unidades;

    public Producto(String nombre, int unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

}