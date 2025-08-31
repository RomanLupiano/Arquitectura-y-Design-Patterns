package DesignPatterns.ExpresionesMatematicas.Solucion4;

public class PolacaInversa extends EstrategiaFormateo{

    @Override
    public String formatear(Termino termino) {
        return termino.getExp2().formatear(this) + termino.getExp1().formatear(this) + termino.getOperador();
    }
    
}
