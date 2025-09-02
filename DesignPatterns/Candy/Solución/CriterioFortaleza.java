package DesignPatterns.Candy.Solución;

public class CriterioFortaleza implements EstrategiaCriterioBusqueda {
    private int fortaleza;

    public boolean evalCriterio(ElemTablero elem) {
        return elem.getFortaleza() > fortaleza;
    }
}
