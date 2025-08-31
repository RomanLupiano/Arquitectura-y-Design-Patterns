package DesignPatterns.ExpresionesMatematicas.Solucion4;

public interface Visitor {
    public void visit(Numero numero);
    public void visit(Termino termino);
}
