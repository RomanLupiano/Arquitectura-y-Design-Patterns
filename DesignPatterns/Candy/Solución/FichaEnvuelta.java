package DesignPatterns.Candy.Solución;

public abstract class FichaEnvuelta implements ElemTablero{
    protected ElemTablero envuelto;

    public FichaEnvuelta(ElemTablero elem){
        envuelto = elem;
    }

    public void DecoradorBase(ElemTablero elem){
        envuelto = elem;
    }

    @Override
    public int getFortaleza() {
        return envuelto.getFortaleza();
    }

    @Override
    public int getEspacio() {
        return envuelto.getEspacio();
    }

    @Override
    public int getPoder() {
        return envuelto.getPoder();
    }
}
