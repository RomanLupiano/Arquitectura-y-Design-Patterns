package DesignPatterns.Candy.Solución;

public class FichaBasica implements ElemTablero{
    private int fortaleza;
    private int espacio;
    private int poder;


    public FichaBasica(int fortaleza, int espacio, int poder) {
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poder = poder;
    }

    @Override
    public int getFortaleza() {
        return fortaleza;
    }

    @Override
    public int getEspacio() {
        return espacio;
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public ElemTablero clonar() {
        return new FichaBasica(this.fortaleza, this.espacio, this.poder);
    }
    
}
