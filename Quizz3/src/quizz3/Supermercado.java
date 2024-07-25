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
public class Supermercado {
    String nombreSuperMercado;
    int codigoSuperMercado;
    String nombreEmpleado;
    String cedulaEmpleado;
    Inventario inventario;

    public Supermercado() {
        this.nombreSuperMercado = JOptionPane.showInputDialog("Por favor digite el nombre del supermercado: ");
        this.codigoSuperMercado = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el codigo del supermercado: "));
        this.nombreEmpleado = JOptionPane.showInputDialog("Digite el nombre del empleado que va a agregar informacion: ");
        this.cedulaEmpleado = JOptionPane.showInputDialog("Digite la cedula del empleado que va a agregar informacion: ");
        this.inventario = new Inventario(nombreEmpleado, cedulaEmpleado);
    }

    public String getNombreSuperMercado() {
        return nombreSuperMercado;
    }

    public int getCodigoSuperMercado() {
        return codigoSuperMercado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setNombreSuperMercado(String nombreSuperMercado) {
        this.nombreSuperMercado = nombreSuperMercado;
    }

    public void setCodigoSuperMercado(int codigoSuperMercado) {
        this.codigoSuperMercado = codigoSuperMercado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    
    
    
}



