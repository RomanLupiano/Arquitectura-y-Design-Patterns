package DesignPatterns.ExpresionesMatematicas.Solucion3;

public class app {
    public static void main(String[] args) {
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(0.5f);

        Operador suma = new Sum();

        Polaca polaca = new Polaca();
        Infija infija = new Infija();

        Termino t1 = new Termino(n1, n2, suma);

        System.out.println(t1.eval());
        System.out.println(t1.getOpuesto().formatear(infija));
    }
}
