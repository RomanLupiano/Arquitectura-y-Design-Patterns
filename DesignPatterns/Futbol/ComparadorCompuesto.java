package DesignPatterns.Futbol;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>{

    private Comparator<Socio> c1;
    private Comparator<Socio> c2;
    
    @Override
    public int compare(Socio arg0, Socio arg1) {
        int result = c1.compare(arg0, arg1);
        if (result == 0) {
            return c2.compare(arg0, arg1);
        }
        return result;
    }
}