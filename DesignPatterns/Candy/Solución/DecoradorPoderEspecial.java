package DesignPatterns.Candy.Solución;

public class DecoradorPoderEspecial extends FichaEnvuelta{

    public DecoradorPoderEspecial(ElemTablero elem){
        super(elem);
    }
    
    public int getPoder() {
        return super.getFortaleza() / super.getEspacio();
    }

    @Override
    public ElemTablero clonar() {
        return new DecoradorPoderEspecial(envuelto.clonar());
    }
}
