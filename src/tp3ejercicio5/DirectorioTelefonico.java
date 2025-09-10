package tp3ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirectorioTelefonico {

    private TreeMap<Long, Contacto> contactos = new TreeMap<>();

    public DirectorioTelefonico() {
        contactos = new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        if (contactos.containsKey(telefono)) {
            System.out.println("El número ya está registrado");
            return;
        }
        contactos.put(telefono, contacto);
    }

    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> asociados = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                asociados.add(entry.getKey());
            }
        }
        return asociados;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> listaDeContactos = new ArrayList<>();
        for (Contacto aux : contactos.values()) {
            if (aux.getCiudad().equalsIgnoreCase(ciudad)) {
                listaDeContactos.add(aux);
            }
        }
        return listaDeContactos;
    }

    public void borrarContacto(long borrarContacto) {
        if (contactos.containsKey(borrarContacto)) {
            contactos.remove(borrarContacto);
            System.out.println("Contacto borrado");
        } else {
            System.out.println("El contacto no existe");
        }
    }
}
