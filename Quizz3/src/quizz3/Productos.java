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
public class Productos {
    //Atributos
    String nombreEmpleado;
    String cedulaEmpleado;
    int codigoProducto;
    String nombreProducto;
    int cantidadProducto;
    double precioBase;
    String tipoProducto;
    double precioBruto;
    

    //Constructor
    public Productos(String nombreEmpleado, String cedulaEmpleado){
        this.codigoProducto = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto: "));
        this.nombreProducto = JOptionPane.showInputDialog("Digite el nombre del producto: ");
        this.cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que desea agregar: "));
        this.precioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio base del producto: "));
        this.tipoProducto = JOptionPane.showInputDialog("Digite el tipo de producto: ");
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.calcularPrecioBruto();
    }
    public Productos(int codigoProducto, String nombreProducto, String nombreEmpleado, String cedulaEmpleado, int cantidadProducto, double precioBase, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
    }
//Getters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }
    
    //Setters

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    
    
    public void calcularPrecioBruto(){
        switch(this.tipoProducto){
            case "Alimentos": 
                this.precioBruto = this.precioBase * 0.20 + this.precioBase;
                break;
            case "Bebidas":
                this.precioBruto = this.precioBase * 0.30 + this.precioBase;
                break;
            case "Higiene":
                this.precioBruto = this.precioBase * 0.25 + this.precioBase + 500;
                break;
            case "Limpieza":
                this.precioBruto = (this.precioBase * 0.19) + (this.precioBase * 0.04) + 1000 + this.precioBase;
                break;
                
        }
    }

    public String getInformacion() {
        String infoProducto = "Nombre del empleado que agrego el producto es: " + this.nombreEmpleado + "\n" +
                "La cedula del empleado que agrego el producto es: " + this.cedulaEmpleado + "\n" +
                "Nombre del producto: " + this.nombreProducto + "\n" + 
                "Codigo del producto: " + this.codigoProducto + "\n" + 
                "Cantidad del producto: " + this.cantidadProducto + "\n" + 
                "Tipo del producto: " + this.tipoProducto + "\n" +
                "Precio base: " + this.precioBase + "\n" + 
                "Precio bruto: " + this.precioBruto + "\n";
        
        return infoProducto;
                
    }
    
    
    
}
