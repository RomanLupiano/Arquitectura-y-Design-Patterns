package DesignPatterns.Candy.Solución;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<ElemTablero> elementos;
    private int puntajeMinimo;

    public float getDificultad(){
        int sumFortaleza = 0;
        int sumPoder = 0;
        for (ElemTablero elemTablero : elementos) {
            sumFortaleza += elemTablero.getFortaleza();
            sumPoder += elemTablero.getPoder();
        }
        return sumFortaleza / sumPoder;
    }

    public List<ElemTablero> getFichas(EstrategiaCriterioBusqueda criterio){
        List<ElemTablero> lista = new ArrayList<ElemTablero>();
        for (ElemTablero elemTablero : elementos) {
            if (criterio.evalCriterio(elemTablero)) {
                lista.add(elemTablero);
            }
        }
        return lista;
    }
}
