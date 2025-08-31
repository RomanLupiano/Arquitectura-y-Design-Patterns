package DesignPatterns.ExpresionesMatematicas.Solucion4;

public class Sum extends Operador {

    public Sum(){
        this.operador = "+";
    }

    public float eval(float val1,float val2) {
        return val1 + val2;
    }

    public Operador getOpuesto() {
        return new Sub();
    } 
    
}
