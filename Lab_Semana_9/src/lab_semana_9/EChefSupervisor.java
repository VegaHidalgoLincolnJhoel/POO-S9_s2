/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_9;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class EChefSupervisor extends Empleado{
        private String SedeSupervisor;
        
        public EChefSupervisor(){
        }

    public String getSedeSupervisor() {
        return SedeSupervisor;
    }

    public void setSedeSupervisor(String SedeSupervisor) {
        this.SedeSupervisor = SedeSupervisor;
    }
        
    public String Reporte(){
        return "Info completa del chef Supervisor";
    }
}
