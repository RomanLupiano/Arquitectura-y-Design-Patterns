package DesignPatterns.ExpresionesMatematicas.Solucion4;

import java.util.ArrayList;
import java.util.List;

public class Termino extends Expresion{
    protected Expresion exp1;
    protected Expresion exp2;
    protected Operador operador;


    public Termino(Expresion e1, Expresion e2, Operador op){
        exp1 = e1;
        exp2 = e2;
        operador = op;
    }
   

    public float eval() {
        return operador.eval(exp1.eval(), exp2.eval());
    }

    public String getOperador() {
        return operador.getOperador();
    }

    public Operador getOperadorInstance() {
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

    public String formatear(EstrategiaFormateo f){
        return f.formatear(this);
    }

    public Expresion setOpuesta(){
        exp1.setOpuesta();
        exp2.setOpuesta();
        operador = operador.getOpuesto();
        return this;
    }

    public Expresion getExp2() {
        return exp2;
    }

    public void setExp2(Expresion exp2) {
        this.exp2 = exp2;
    }

    public Expresion getExp1() {
        return exp1;
    }

    public void setExp1(Expresion exp1) {
        this.exp1 = exp1;
    }

    public Expresion getOpuesto() {
        return this.setOpuesta();
    }

    @Override
    public Expresion getNormalizada(float num) {
        return new Termino(exp1.getNormalizada(num), exp2.getNormalizada(num), operador);
    }

    @Override
    public Expresion getCopia() {
        return new Termino(exp1.getCopia(), exp2.getCopia(), operador);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
