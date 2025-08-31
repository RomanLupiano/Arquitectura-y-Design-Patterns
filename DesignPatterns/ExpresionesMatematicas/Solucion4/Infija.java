package DesignPatterns.ExpresionesMatematicas.Solucion4;

public class Infija extends EstrategiaFormateo{

    @Override
    public String formatear(Termino termino) {
        return termino.getExp1().formatear(this) + termino.getOperador() + termino.getExp2().formatear(this);
    }
     
}
