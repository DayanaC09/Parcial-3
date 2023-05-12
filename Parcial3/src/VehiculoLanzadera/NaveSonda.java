package VehiculoLanzadera;

import VehiculoLanzadera.NaveNoTripulada;

  public class NaveSonda extends NaveNoTripulada {
	    public NaveSonda(String nombre, int capacidadCarga) {
	        super(nombre, capacidadCarga);
	    }
	    
	    public void maniobrar() {
	        System.out.println("La sonda " + getNombre() + " está maniobrando en el espacio.");
	    }

}
