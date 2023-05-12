package VehiculoLanzadera;

import VehiculoLanzadera.ComportamientoNave;
import VehiculoLanzadera.NaveEspacial;
    public abstract class NaveTripulada extends NaveEspacial implements ComportamientoNave {
	    private int numTripulantes;
	    
	    public NaveTripulada(String nombre, int capacidadCarga, int numTripulantes) {
	        super(nombre, capacidadCarga, true);
	        this.numTripulantes = numTripulantes;
	    }
	    
	    public NaveTripulada1(String nombre, int capacidadCarga, int numTripulantes2) {
			// TODO Auto-generated constructor stub
		}

		public int getNumTripulantes() {
	        return numTripulantes;
	    }
	    
	    public void setNumTripulantes(int numTripulantes) {
	        this.numTripulantes = numTripulantes;
	    }

}
