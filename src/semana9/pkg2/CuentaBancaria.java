/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9.pkg2;

import java.util.Scanner;

public class CuentaBancaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String opcion;
        String cliente, telefono;
        int numCuenta;
        float monto;
        boolean continuar = true;

        
        CuentaBanco cuenta = new CuentaBanco("Desconocido", 0, "Desconocido");

       
        System.out.println("===== BIENVENIDO A BANCO DE DINERO =====");
        System.out.print("Ingrese su nombre: ");
        cliente = scanner.nextLine();

        System.out.print("Ingrese su numero de cuenta: ");
        numCuenta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su numero de telefono: ");
        telefono = scanner.nextLine();

        
        cuenta.setCliente(cliente);
        cuenta.setNumCuenta(numCuenta);
        cuenta.setTelefono(telefono);

       
        while (continuar) {
            System.out.println("\n¿Desea realizar un deposito o un retiro? (Escriba 'deposito' o 'retiro'):");
            opcion = scanner.nextLine().toLowerCase();

            if (opcion.equals("deposito")) {
               
                System.out.print("Ingrese el monto a depositar: Lps. ");
                monto = scanner.nextFloat();

               
                cuenta.depositar(monto);

               
                System.out.println("\nTransaccion completada: Deposito");
                System.out.println("Monto: Lps. " + monto);
                System.out.println("Nuevo saldo: Lps. " + cuenta.getSaldo());
            } else if (opcion.equals("retiro")) {
                // Entrada
                System.out.print("Ingrese el monto a retirar: Lps. ");
                monto = scanner.nextFloat();

                
                cuenta.retirar(monto);

               
                System.out.println("\nTransaccion completada: Retiro");
                System.out.println("Monto: Lps. " + monto);
                System.out.println("Nuevo saldo: Lps. " + cuenta.getSaldo());
            } else {
                System.out.println("Opción invalida. Intente nuevamente.");
            }

            scanner.nextLine(); 

            
            System.out.print("\n¿Desea realizar otra transaccion? (sí/no): ");
            String respuesta = scanner.nextLine().toLowerCase();
            continuar = respuesta.equals("sí");
        }

        
        System.out.println("\nGracias por utilizar el Banco de Dinero. Que tenga un buen dia");
        scanner.close();
    }
}