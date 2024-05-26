public class Camion extends Vehiculocarga{
    private int numEjes;
    
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadcarga, int numEjes) {
    
        super(marca, modelo, año, kilometraje, capacidadcarga);

        this.numEjes = numEjes;
    
    }
     //getter y setter para Numejes
    
        public int getnumEjes() {
        return numEjes;
        
    
    }


        public void setnumEjes(int numEjes) {
            this.numEjes = numEjes;
        }
     //sobreescribir el metodo mostrarInfo()
        @Override
        public void mostrarInfo() {

        super.mostrarInfo();
            
        System.out.println("Numero de Ejes:" + numEjes);
        
    }
       //sobreescribo el metodo realizar mantenimiento
        
        
                
    @Override
            
            public void realizarMantenimiento(double costoPorkm, double kilometrosRecorridos) {
        System.out.println("El mantenimiento del frenado en el camion.");
        
        super.realizarMantenimiento(costoPorkm, kilometrosRecorridos);
                
    }


}