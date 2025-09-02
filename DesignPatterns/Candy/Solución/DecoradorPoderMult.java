package DesignPatterns.Candy.Solución;

public class DecoradorPoderMult extends FichaEnvuelta{
    
    private int mult;

    public DecoradorPoderMult(ElemTablero elem, int mult) {
        super(elem);
        this.mult = mult;
    }

    @Override
    public int getPoder() {
        return super.getPoder() * mult;
    }

    @Override
    public ElemTablero clonar() {
        return new DecoradorPoderMult(envuelto.clonar(), this.mult);
    }
    
}
