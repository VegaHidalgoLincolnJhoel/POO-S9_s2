/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class PCCriolla extends PlatoComida implements IPromoCriolla{
    private String InsumoBase = "Carne Res, Arroz, Aderezo";

    public PCCriolla() {
    }

    public String getInsumoBase() {
        return InsumoBase;
    }

    public void setInsumoBase(String InsumoBase) {
        this.InsumoBase = InsumoBase;
    }
    
    public String reporte(){
        return "Reporte completo de comida Criolla: ";
    }

    @Override
    public String getNombrePromo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getVigenciaPromo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getNumPlatosMin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getPorcDesc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
