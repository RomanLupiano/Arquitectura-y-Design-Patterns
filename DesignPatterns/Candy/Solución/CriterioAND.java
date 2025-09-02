package DesignPatterns.Candy.Solución;

public class CriterioAND implements EstrategiaCriterioBusqueda{
    private EstrategiaCriterioBusqueda e1;
    private EstrategiaCriterioBusqueda e2;

    public boolean evalCriterio(ElemTablero elem) {
        return e1.evalCriterio(elem) && e2.evalCriterio(elem);
    }
}
