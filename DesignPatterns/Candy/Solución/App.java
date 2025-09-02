package DesignPatterns.Candy.Solución;

public class App {
    public static void main(String[] args) {
        ElemTablero fichaEspecial = new FichaBasica(4, 2, 0);
        fichaEspecial = new DecoradorPoderEspecial(fichaEspecial);

        System.out.println(fichaEspecial.getPoder());


        fichaEspecial = new DecoradorPoderMult(fichaEspecial, 2);

        System.out.println("Fortaleza: " + fichaEspecial.getFortaleza());
        System.out.println("Espacio: " + fichaEspecial.getEspacio());
        System.out.println("Poder: " + fichaEspecial.getPoder());


        ElemTablero fichaClonada = fichaEspecial.clonar();

        System.out.println("Fortaleza: " + fichaClonada.getFortaleza());
        System.out.println("Espacio: " + fichaClonada.getEspacio());
        System.out.println("Poder: " + fichaClonada.getPoder());
    }
}
