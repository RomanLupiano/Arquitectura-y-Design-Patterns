package DesignPatterns.Futbol;

import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Predio predio = new Predio();

        Socio s1 = new Socio("Pepe", "Juarez", 35, true);
        Socio s2 = new Socio("Maria", "Azuleda", 28, true);
        Socio s3  = new Socio("Leo", "Mattioli", 22, false);
        Socio s4  = new Socio("Mauro", "Lombardo", 16, false);

        predio.addSocio(s1);
        predio.addSocio(s2);
        predio.addSocio(s3);
        predio.addSocio(s4);

        CriterioBusqueda c1 = new CriterioEdad(25);
        Comparator<Socio> f1 = new ComparadorEdad();

        List<Socio> lista = predio.getSociosOrdenados(c1, f1.reversed());
        for (Socio socio : lista) {
            System.out.println(socio);
        }

    }
}
