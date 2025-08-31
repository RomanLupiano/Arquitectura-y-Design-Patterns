package DesignPatterns.ExpresionesMatematicas.Solucion4;

public abstract class Operador {
    protected String operador;

    public abstract float eval(float val1, float val2);
    public abstract Operador getOpuesto();

    public String getOperador(){
        return operador;
    }
}
