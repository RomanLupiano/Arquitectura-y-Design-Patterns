package DesignPatterns.Candy.Solución;

public class CriterioPoder implements EstrategiaCriterioBusqueda {
    private int poder;

    public boolean evalCriterio(ElemTablero elem) {
        return elem.getPoder() > poder;
    }
}
