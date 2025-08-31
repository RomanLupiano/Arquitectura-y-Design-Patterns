package DesignPatterns.ExpresionesMatematicas.Solucion2;

public class Polaca extends EstrategiaFormateo{

    @Override
    public String formatear(Termino termino) {
        return termino.getOperador() + termino.getExp1().formatear(this) + termino.getExp2().formatear(this);
    }
    
}
