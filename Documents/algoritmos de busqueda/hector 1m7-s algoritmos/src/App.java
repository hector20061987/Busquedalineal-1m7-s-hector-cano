// Nombre: hector antonio cano oliva
    // Profesor: cristopher larios
    // carnet: 2024-1655U
    // Grupo: 1m7-s
    // Fecha: 09/05/2024


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡BIENVENIDO AL PROGRAMA DE BUSQUEDA DE PRODUCTOS!");

        //  pedir al usuario coordialmente el tamanio del arreglo

        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo de productos para el usuario
        String[] productos = new String[n];

        // Pedir al usuario los nombres de los productos que va agregar

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.next();
        }

        // Pedir al usuario el nombre del producto que desea buscar

        System.out.print("Ingresa el producto que deseas buscar: ");
        String productoBuscado = scanner.next();

        // Buscar el producto en el arrglo con el metodo de insertion sort
        
        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (productos[i].equalsIgnoreCase(productoBuscado)) {

                encontrado = true;

                break;
            }
        }

        // Mostrar el resultado al usuario

        if (encontrado) {
            
            System.out.println("El producto \"" + productoBuscado + "\" fue encontrado.");
        
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no fue encontrado.");
        }
    }
}