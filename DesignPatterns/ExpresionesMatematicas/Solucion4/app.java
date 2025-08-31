package DesignPatterns.ExpresionesMatematicas.Solucion4;

public class app {
    public static void main(String[] args) {
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(0.5f);

        Operador suma = new Sum();

        Infija infija = new Infija();

        Termino t1 = new Termino(n1, n2, suma);

        EvalVisitor visitor = new EvalVisitor();

        //System.out.println(t1.eval());
        visitor.visit(t1);
        System.out.println(visitor.getResult());
        System.out.println(t1.getOpuesto().formatear(infija));
    }
}
