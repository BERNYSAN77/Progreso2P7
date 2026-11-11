package colecciones.modelo;

import java.util.ArrayList;
import java.util.List;

public class AppStore {
    List<Juego> juegos;

    public AppStore(){
        juegos = new ArrayList<Juego>();
    }
    public void cargarDatos(){
        juegos.add(new Juego("Fifa2026","Deportes",15,45,50));
        juegos.add(new Juego("Roblox","Acción",23,59,80));
    }

    public List<Juego> getJuegos() {
        return juegos;
    }
    public void agregarJuego(Juego j){
        juegos.add(j);
    }

    public Juego buscarJuego(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            for(int i = 0; i < juegos.size(); i++){
                if(juegos.get(i).getNombre().equalsIgnoreCase(nombre)){
                    return juegos.get(i);
                }
            }
        }
        return null;
    }

    public boolean comprar(String nombre, int cantidad){
        return false;
    }
}
