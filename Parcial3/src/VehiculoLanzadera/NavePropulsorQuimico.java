package VehiculoLanzadera;

import VehiculoLanzadera.NaveNoTripulada;

public abstract class NavePropulsorQuimico extends NaveNoTripulada {
    private String tipoCombustible;
    
    public NavePropulsorQuimico(String nombre, int capacidadCarga, String tipoCombustible) {
        super(nombre, capacidadCarga);
        this.tipoCombustible = tipoCombustible;
    }
    
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public void despegar(int potencia) {
        System.out.println("La nave " + getNombre() + " está despegando con una potencia de " + potencia + " toneladas.");
    }
	

}
