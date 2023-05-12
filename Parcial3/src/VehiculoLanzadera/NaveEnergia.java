package VehiculoLanzadera;

import VehiculoLanzadera.NaveTripulada;

public class NaveEnergia extends NaveTripulada {
	    public NaveEnergia(String nombre, int capacidadCarga, int numTripulantes) {
	        super(nombre, capacidadCarga, numTripulantes);
	    }
	    
	    
	    public void maniobrar(){
	        System.out.println("La nave Energía está maniobrando en el espacio.");
	    }

}
