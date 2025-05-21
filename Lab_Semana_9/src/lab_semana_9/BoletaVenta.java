/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class BoletaVenta {
    private Cliente algunCliente;
    private PlatoComida algunPlato;
    private String fecha;
    private String desc;
    private double totalPago;

    public BoletaVenta() {
    }

    public Cliente getAlgunCliente() {
        return algunCliente;
    }

    public void setAlgunCliente(Cliente algunCliente) {
        this.algunCliente = algunCliente;
    }

    public PlatoComida getAlgunPlato() {
        return algunPlato;
    }

    public void setAlgunPlato(PlatoComida algunPlato) {
        this.algunPlato = algunPlato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    
    
}
