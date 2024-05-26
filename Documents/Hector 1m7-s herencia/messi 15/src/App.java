public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Acerca del carro");
    

        Auto auto= new Auto("Toyota", "Corrola", 2020, 15000, 5, "Super");
    

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        //Se muestra la informacion de cada Vehiculo

        System.out.println("Informacion del Auto:");

        auto.mostrarInfo();

        System.out.println("Mantenimiento del sistema de direccion en el Auto.");
    

        auto.realizarMantenimiento(4, 14);

        System.out.println("informacion del camion:");

        camion.mostrarInfo();
        
        camion.realizarMantenimiento(12, 30);
    }
}