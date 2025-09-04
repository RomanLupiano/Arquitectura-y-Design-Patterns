package DesignPatterns.Futbol;

public class CriterioEdad implements CriterioBusqueda{

    private int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean evalCriterio(Socio socio) {
        return socio.getEdad() > edad;
    }
}
