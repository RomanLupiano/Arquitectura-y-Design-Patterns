package DesignPatterns.Futbol;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio arg0, Socio arg1) {
        if (arg0.getEdad() > arg1.getEdad()) return -1;
        if (arg0.getEdad() < arg1.getEdad()) return 1;
        return 0;
    }
    
}
