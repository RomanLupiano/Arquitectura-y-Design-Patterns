package DesignPatterns.Candy.Solución;

public class CriterioEspacio implements EstrategiaCriterioBusqueda{
    private int espacio;

    public boolean evalCriterio(ElemTablero elem) {
        return elem.getEspacio() > espacio;
    }
}
