package DesignPatterns.ExpresionesMatematicas.Solucion;

public class Sub extends Termino{

    public Sub(){
        this.operador = "-";
    }
    
    public Sub(Expresion e1, Expresion e2){
        exp1 = e1;
        exp2 = e2;
        this.operador = "-";
    }

    @Override
    public float eval() {
        return exp1.eval() - exp2.eval();
    }

    @Override
    public Expresion getOpuesto() {
        return new Sum(exp1.getOpuesto(), exp2.getOpuesto());
    }

    @Override
    public Expresion getNormalizada(float num) {
        return new Sub(exp1.getNormalizada(num), exp2.getNormalizada(num));
    }

    @Override
    public Termino getCascaron() {
        return new Sub();
    }
}
