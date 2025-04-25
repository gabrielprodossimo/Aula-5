package testes;

import poligonos.Triângulo;

public class TesteTriângulo {
    public static boolean testaArea(){
        Triângulo t1 = new Triângulo(3, 4, 5, "azul");
        if (t1.calculaÁrea()==6)
            return true;
        return false;
    }
    public static boolean testaPerimetro(){
        Triângulo t1 = new Triângulo(3, 4, 5, "azul");
        if (t1.calculaPerímetro()==12)
            return true;
        return false;
    }
}
