package DesignPatterns.Futbol;

import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultimaCuotaPaga;
    private List<Alquiler> alquileres;

    
    public Socio(String nombre, String apellido, int edad, boolean ultimaCuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuotaPaga = ultimaCuotaPaga;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isUltimaCuotaPaga() {
        return ultimaCuotaPaga;
    }
    public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
        this.ultimaCuotaPaga = ultimaCuotaPaga;
    }
    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.edad + " " + this.ultimaCuotaPaga;
    }
}
