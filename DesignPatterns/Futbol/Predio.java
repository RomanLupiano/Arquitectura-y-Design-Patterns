package DesignPatterns.Futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Predio {
    private List<Socio> socios;

    public Predio() {
        socios = new ArrayList<Socio>();
    }

    public void addSocio(Socio socio){
        socios.add(socio);
    }

    public List<Socio> getSociosOrdenados(CriterioBusqueda c, Comparator<Socio> f) {
        List<Socio> lista = new ArrayList<Socio>();
        for (Socio socio : socios) {
            if (c.evalCriterio(socio)) {
                lista.add(socio );
            }
        }
        Collections.sort(lista, f);
        return lista;
    }
}
