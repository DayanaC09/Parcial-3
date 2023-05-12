package VehiculoLanzadera;

import VehiculoLanzadera.NaveNoTripulada;

public class NaveProtón extends NaveNoTripulada {
    public NaveProtón(String nombre, int capacidadCarga) {
        super(nombre, capacidadCarga);
    }
    
    @Override
    public void maniobrar() {
        System.out.println("El cohete Protón está maniobrando en el espacio.");
    }

}
