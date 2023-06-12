import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {

    private int cont = 0;
    private ArrayList<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public boolean ingresarPlato(String nombre, double precio, double calorias, int tiempodepreparacion) {
        // VValidacion por si hay un libro con el mismo nombre
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                return false; // Libro ya existe
            }
        }
        //Agregar plato
        Plato p = new Plato(nombre, precio, calorias, tiempodepreparacion);
        cont++;
        //p.setNombre(cont);
        platos.add(p);
        return true; // Plato creado
    }
    public Plato buscarPlatoPorNombre(String nombre) {
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                return plato; // Plato encontrado
            }
        }
        return null; // Plato no encontrado
    }

    public Plato eliminarPlatoPorNombre(String nombre) {
        Plato platoEncontrado = buscarPlatoPorNombre(nombre);
        if (platoEncontrado != null) {
            platos.remove(platoEncontrado);
        }
        return platoEncontrado; // Plato encontrado
    }

    public Plato modificarPlato(String nombre, double nuevoPrecio, double nuevasCalorias, int nuevoTiempoPreparacion) {
        Plato platoEncontrado = buscarPlatoPorNombre(nombre);
        if (platoEncontrado != null) {
            platoEncontrado.setPrecio(nuevoPrecio);
            platoEncontrado.setCalorias(nuevasCalorias);
            platoEncontrado.setTiempodepreparacion(nuevoTiempoPreparacion);
        }
        return platoEncontrado; // Plato encontrado
    }


}
