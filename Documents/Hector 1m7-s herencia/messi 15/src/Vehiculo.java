
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    //constructor


    public Vehiculo(String marca,String modelo,int año, int kilometraje){
        this.marca = marca;

        this.modelo = modelo;

        this.año = año;

        this.kilometraje = kilometraje;

    }


    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca =marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void SetModelo(String modelo) {
        this.modelo=modelo;
    }
    public  int getAño(int año) {
        return año;
    }
    public void setAño(int año) {
        this.año=año;
    }
    public int getkilometraje() { 
        return kilometraje;
    }
    public void setkilometraje(int kilometraje) {
        this.kilometraje=kilometraje;
    }
    
    
    //metodo para mostrar la info del vehiculo
    public void mostrarInfo() {
        System.out.println("Marca:" +marca);
        System.out.println("Modelo:" +modelo);
        System.out.println("Año:" +año);
        System.out.println("kilometraje:" +kilometraje);
    
    }



    //Mectodo para realizar mantenimiento basico

    public void realizarMantenimiento(double costoPorkm, double kilometrosRecorridos) { 
        double costoTotal = costoPorkm * kilometrosRecorridos;
        System.out.println("Costo total del mantenimiento: $" +costoTotal); 


    }



    public static void main(String[] args) {

        Auto elAuto = new Auto( "Toyota", "Corrola", 2020, 15000, 5, "Super");

        Camion elcamion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);
    

    }
        
    
}
    
