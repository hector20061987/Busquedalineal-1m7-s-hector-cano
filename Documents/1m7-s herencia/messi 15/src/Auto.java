public class Auto extends vehiculosPasajeros {
    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
  //getter and setter


    public String getTipoCombustible() {
    return tipoCombustible;
    
}

    public void settipoCombustible(String tipoCombustible) {
    this.tipoCombustible = tipoCombustible;
    
}
    
//sobreescribir el  metodo mostrarInfo()
@Override
public void mostrarInfo() {

super.mostrarInfo();

System.out.println("Tipo de combustible:" + tipoCombustible);
}
//Sobreescribo el metodo mostrar mantenimiento
    @Override
    public void realizarMantenimiento(double costoPorkm, double kilometrosRecorridos) {
    
        super.realizarMantenimiento(costoPorkm, kilometrosRecorridos);

    System.out.println("Verificar la alineacion de las ruedas.");
    
        System.out.println("Inspeccionar la direccion asistida.");
        
        System.out.println("Lubricar componentes del sistema de direccion.");
    
        }
    
    }