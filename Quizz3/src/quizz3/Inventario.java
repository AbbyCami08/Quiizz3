/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz3;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Inventario {
    private Productos producto[];
    private String nombreEmpleado;
    private String cedulaEmpleado;
    
    public Inventario (String nombreEmpleado, String cedulaEmpleado){
        int productoCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de objetos que quiere registrar: "));
        this.producto = new Productos [productoCantidad];
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        
        
    }
    public void agregarProducto(){
        for (int i = 0; i < producto.length; i++){
            Productos productoNuevo = new Productos(nombreEmpleado, cedulaEmpleado);
            this.producto[i]= productoNuevo;
        }
        
    }
    public void imprimirDatosProductos(){
        String datos = "";
        for (int i = 0; i < producto.length; i++){
            datos = datos + producto[i].getInformacion() + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
    }
   
    public void imprimirGananciaTotal(){
        double ganancia = 0;
        for (int i = 0; i < producto.length; i++){
            ganancia = ganancia + (producto[i].getPrecioBruto() - producto[i].getPrecioBase()) * producto[i].getCantidadProducto();
        }
        JOptionPane.showMessageDialog(null, "Ganancia total: " + ganancia);
        
       
    }
    
    public void establecerEmpleado(String nombre, String cedula){
        for (int i = 0; i < producto.length; i++){
            producto[i].setNombreEmpleado(nombre);
            producto[i].setCedulaEmpleado(cedula);
            
        }
    }
    
    
}
