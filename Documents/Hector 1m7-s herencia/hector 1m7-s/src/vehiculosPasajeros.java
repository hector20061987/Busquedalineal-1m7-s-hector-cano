public class vehiculosPasajeros extends Vehiculo{

    private int numPasajeros;

    //constructor
    public vehiculosPasajeros(String marca ,String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }
    
    //getter y Setter para numPasajeros
public int getNumPasajeros() {

return numPasajeros;

}


public void setNumPasajeros(int numPasajeros) {

    this.numPasajeros = numPasajeros;

}

//Sobreescribir el metodo mostrar Info()

@Override
public void mostrarInfo() {

    super.mostrarInfo();

    System.out.println("Numero de Pasajeros: " + numPasajeros);

}


}
