package testes;

import poligonos.TriânguloEquilátero;

public class TesteEquilátero {
    public static boolean testaArea(){
        TriânguloEquilátero t1 = new TriânguloEquilátero(3, "azul");
        if (t1.calculaÁrea()-(3*3*Math.sqrt(3)/4)<0.00001)
            return true;
        return false;
    }
    public static boolean testaPerimetro(){
        TriânguloEquilátero t1 = new TriânguloEquilátero(3, "azul");
        if (t1.calculaPerímetro()==9)
            return true;
        return false;
    }
}
