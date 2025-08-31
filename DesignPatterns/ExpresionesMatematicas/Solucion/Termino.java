package DesignPatterns.ExpresionesMatematicas.Solucion;

import java.util.ArrayList;
import java.util.List;

public abstract class Termino extends Expresion{
    protected Expresion exp1;
    protected Expresion exp2;

    public Expresion getExp2() {
        return exp2;
    }

    public void setExp2(Expresion exp2) {
        this.exp2 = exp2;
    }

    protected String operador;


    public Expresion getExp1() {
        return exp1;
    }

    public void setExp1(Expresion exp1) {
        this.exp1 = exp1;
    }


    public String getOperador() {
        return operador;
    }

    public List<Float> getNumeros(){
        List<Float> lista = new ArrayList<Float>();
        lista.addAll(exp1.getNumeros());
        lista.addAll(exp2.getNumeros());
        return lista;
    }

    public List<String> getOperadores(){
        List<String> lista = new ArrayList<String>();
        lista.addAll(exp1.getOperadores());
        lista.addAll(exp2.getOperadores());
        return lista;
    }

    public String toString(){
        return "(" + exp1.toString() + operador + exp2.toString() + ")";
    }

    public abstract Termino getCascaron();

    public Expresion getCopia(){
        Termino t = this.getCascaron();
        t.setExp1(exp1.getCopia());
        t.setExp2(exp1.getCopia());
        return t;
    }
}
