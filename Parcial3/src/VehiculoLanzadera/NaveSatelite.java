package VehiculoLanzadera;

import VehiculoLanzadera.NaveNoTripulada;

public class NaveSatelite extends NaveNoTripulada {
	    public NaveSatelite(String nombre, int capacidadCarga) {
	        super(nombre, capacidadCarga);
	    }
	    
	    public void maniobrar() {
	        System.out.println("El satélite " + getNombre() + " está maniobrando en el espacio.");
	    }
	    
}

