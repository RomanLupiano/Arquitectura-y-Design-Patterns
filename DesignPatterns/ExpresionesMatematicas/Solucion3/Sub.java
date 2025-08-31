package DesignPatterns.ExpresionesMatematicas.Solucion3;

public class Sub extends Operador{

    public Sub(){
        this.operador = "-";
    }

    public float eval(float val1,float val2) {
        return val1 - val2;
    }

    public Operador getOpuesto() {
        return new Sum();
    } 
}
