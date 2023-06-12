public class Plato {

    private String nombre;
    private double precio;
    private double calorias;
    private int tiempodepreparacion;

    public Plato(String nombre, double precio, double calorias, int tiempodepreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.tiempodepreparacion = tiempodepreparacion;
    }
    public static Plato[] quemadoDeDatos() {
        Plato[] platos = new Plato[3];

        Plato plato1 = new Plato("Plato 1", 10.99, 500, 30);
        Plato plato2 = new Plato("Plato 2", 15.99, 700, 45);
        Plato plato3 = new Plato("Plato 3", 12.99, 600, 35);

        platos[0] = plato1;
        platos[1] = plato2;
        platos[2] = plato3;

        return platos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setTiempodepreparacion(int tiempodepreparacion) {
        this.tiempodepreparacion = tiempodepreparacion;
    }

    @Override
    public String toString() {
        return
                "Nombre='" + nombre +
                "\nPrecio=" + precio +
                "\nCalorias=" + calorias +
                "\nTiempodepreparacion=" + tiempodepreparacion;
    }
}
