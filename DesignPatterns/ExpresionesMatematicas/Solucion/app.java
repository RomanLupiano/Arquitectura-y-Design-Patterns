package DesignPatterns.ExpresionesMatematicas.Solucion;

public class app {
    public static void main(String[] args) {
        Numero diez = new Numero(10);
        Numero unmedio = new Numero(0.5f);

        Termino suma = new Sum(diez, unmedio);
        System.out.println(suma.eval());
        System.out.println(suma.getOpuesto());
    }
}
