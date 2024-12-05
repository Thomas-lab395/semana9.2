/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana9.pkg2;

/**
 *
 * @author Mayra Bardales
 */
public class CuentaBanco {
    
    private String cliente;
    private String telefono;
    private int numCuenta;
    private final float LIMITE = 999999;
    private float saldo;

   
    public CuentaBanco(String cliente, int numCuenta, String telefono) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.telefono = telefono;
        this.saldo = 0; 
    }

        public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    
    public void depositar(float monto) {
        if (monto > 0 && (saldo + monto) <= LIMITE) {
            saldo += monto;
        } else {
            System.out.println("Deposito invalido. Revise el monto o el limite.");
        }
    }

    public void retirar(float monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Retiro invalido. Fondos insuficientes o monto invalido.");
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Telefono: " + telefono);
        System.out.println("Saldo: $" + saldo);
    }
}
