/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz3;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Quizz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al programa");
        Supermercado mercado = new Supermercado();
        mercado.inventario.agregarProducto();
        mercado.inventario.imprimirDatosProductos();
        mercado.inventario.imprimirGananciaTotal();
        
        
        
    }
    
}
