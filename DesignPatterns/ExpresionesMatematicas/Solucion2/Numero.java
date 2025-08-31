package DesignPatterns.ExpresionesMatematicas.Solucion2;

import java.util.ArrayList;
import java.util.List;

public class Numero extends Expresion{
    private float valor;

    public Numero(float valor){
        this.valor = valor;
    }

    public float eval() {
        return valor;
    }

    public List<Float> getNumeros() {
        List<Float> lista = new ArrayList<Float>();
        lista.add(valor);
        return lista;
    }
    public List<String> getOperadores() {
        return new ArrayList<String>();
    }

    public Expresion getOpuesto() {
        return new Numero(valor);
    }

    public Expresion getNormalizada(float num) {
        return new Numero(valor/num);
    }

    public Expresion getCopia() {
        return new Numero(valor);
    }

    public String formatear(EstrategiaFormateo f){
        return String.valueOf(valor);
    }
}
