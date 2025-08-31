package DesignPatterns.ExpresionesMatematicas.Solucion2;

import java.util.List;

public abstract class Expresion {
    public abstract float eval();
    public abstract List<Float> getNumeros();
    public abstract List<String> getOperadores();
    public abstract Expresion getOpuesto();
    public abstract Expresion getNormalizada(float num);
    public abstract Expresion getCopia();
    public abstract String formatear(EstrategiaFormateo f);
}
