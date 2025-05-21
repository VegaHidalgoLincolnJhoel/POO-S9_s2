/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public interface IPromoItaliana {
    String nombrePromo = "Promo Italiana";
    public final String vigencia = "02/05/25";
    int descuento = 10;

    public abstract String getNombrePromo();

    public abstract String getVigencia();

    public abstract int getDescuento();
    
    
}
