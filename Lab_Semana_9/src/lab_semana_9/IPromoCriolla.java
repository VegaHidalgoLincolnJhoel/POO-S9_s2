/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public interface IPromoCriolla {
    String nombrePromo = "Promo a lo Criollo";
    String vigencia = "02/01/25 - 02/03/25";
    int numPlatosMin = 3;
    int porcDesc = 15;
    
    String getNombrePromo();
    String getVigenciaPromo();
    int getNumPlatosMin();
    int getPorcDesc();
}
