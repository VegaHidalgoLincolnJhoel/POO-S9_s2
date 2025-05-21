/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class PCItaliana extends PlatoComida implements IPromoItaliana{
    private String insumosBase = "Pasta, Salsa";

    public PCItaliana() {
    }

    public String getInsumosBase() {
        return insumosBase;
    }

    public void setInsumosBase(String insumosBase) {
        this.insumosBase = insumosBase;
    }
    
    public String reporte(){
        return "Reporte completo de comida Italiana: ";
    }

    @Override
    public String getNombrePromo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getVigencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
