package tp3ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DirectorioTelefonico {
    private TreeMap<Long, Contacto> directorio;
    
    public DirectorioTelefonico(){
        this.directorio = new TreeMap<>();
    }

    public void agregarContacto(Long nroTelefono, Contacto contacto){
        directorio.put(nroTelefono, contacto);
    }
    
    public Contacto buscarContacto(Long keyBuscada){
        return directorio.get(keyBuscada);
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> asociados = new HashSet<>();
        for(Map.Entry<Long, Contacto> entry : directorio.entrySet()){
            if(entry.getValue().getApellido().equalsIgnoreCase(apellido)){
                asociados.add(entry.getKey());
            }
        }
        return asociados;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> listaDeContactos = new ArrayList<>();
        for(Contacto aux : directorio.values()){
            if(aux.getCiudad().equalsIgnoreCase(ciudad)){
                listaDeContactos.add(aux);
            }
        }
        return listaDeContactos;
    }
    
    public void borrarContacto(long borrarContacto){
        if(directorio.containsKey(borrarContacto)){
            directorio.remove(borrarContacto);
            System.out.println("Contacto borrado");
        }else{
            System.out.println("El contacto no existe");
        }
    }
}
