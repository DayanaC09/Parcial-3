package VehiculoLanzadera;

public class NaveEspacial {
	private String nombre;
    private int capacidadCarga;
    private boolean tripulada;
    
    public NaveEspacial(String nombre, int capacidadCarga, boolean tripulada) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.tripulada = tripulada;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    public boolean isTripulada() {
        return tripulada;
    }
    
    public void despegar() {
        System.out.println("La nave " + nombre + " está despegando.");
    }
    
    public void aterrizar() {
        System.out.println("La nave " + nombre + " está aterrizando.");
    }

}
