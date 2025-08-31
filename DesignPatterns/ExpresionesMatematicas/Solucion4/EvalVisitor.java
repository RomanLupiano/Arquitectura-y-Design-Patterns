package DesignPatterns.ExpresionesMatematicas.Solucion4;

public class EvalVisitor implements Visitor{

    private float result;

    public float getResult(){
        return result;
    }

    public void visit(Numero numero) {
        result = numero.eval();
    }

    public void visit(Termino termino) {
        termino.getExp1().accept(this);
        float leftResult = result;
        termino.getExp2().accept(this);
        result = termino.getOperadorInstance().eval(leftResult, result);
    }
}
