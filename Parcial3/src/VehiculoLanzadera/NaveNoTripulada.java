package VehiculoLanzadera;

import VehiculoLanzadera.ComportamientoNave;
import VehiculoLanzadera.NaveEspacial;

  public abstract class NaveNoTripulada extends NaveEspacial implements ComportamientoNave {
    public NaveNoTripulada(String nombre, int capacidadCarga) {
        super(nombre, capacidadCarga, false);
        
        
        
    }
  }