package DesignPatterns.Futbol;

import java.time.LocalDateTime;

public class Alquiler {
    private LocalDateTime fecha;
    private String canchaID;
    private int pago;
    
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public String getCanchaID() {
        return canchaID;
    }
    public void setCanchaID(String canchaID) {
        this.canchaID = canchaID;
    }
    public int getPago() {
        return pago;
    }
    public void setPago(int pago) {
        this.pago = pago;
    }
}
