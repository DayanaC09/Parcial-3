package VehiculoLanzadera;

import VehiculoLanzadera.NaveTripulada;

public class NaveDragonV2 extends NaveTripulada {
	    public NaveDragonV2(String nombre, int capacidadCarga, int numTripulantes) {
	        super(nombre, capacidadCarga, numTripulantes);
	    }
	    
	    @Override
	    public void maniobrar() {
	        System.out.println("La nave Dragón V2 está maniobrando en el espacio.");
	    }
	    
	    public void acoplarse() {
	        System.out.println("La nave Dragón V2 se está acoplando a la Estación Espacial Internacional.");
	    }

}
