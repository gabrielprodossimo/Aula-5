import poligonos.*;

//package poligonos;

public class App {
    public static void main(String[] args) {
        Triângulo triângulo = new Triângulo(4,2,3, "azul");
        System.out.println(triângulo);
        System.out.println("Perímetro do triãngulo: " + triângulo.calculaPerímetro());
        System.out.println("Área do triângulo: " + triângulo.calculaÁrea());
        System.out.println(triângulo.getLado1());
        System.out.println(triângulo.getLado2());
        System.out.println(triângulo.getLado3());
        System.out.println(triângulo.getCor());

        triângulo.setLado1(5);
        triângulo.setLado2(1);
        triângulo.setLado3(3);

        System.out.println("Perímetro do triãngulo: " + triângulo.calculaPerímetro());
        System.out.println("Área do triângulo: " + triângulo.calculaÁrea());

        TriânguloEquilátero triânguloEquilátero = new TriânguloEquilátero(3,"azul");
        System.out.println(triânguloEquilátero);
        System.out.println("Perímetro do triãngulo equilátero: " + triânguloEquilátero.calculaPerímetro());
        System.out.println("Área do triângulo equilátero: " + triânguloEquilátero.calculaÁrea());
  


        // Cria pentágono regular de lado 4cm
        Poligono pentágono = new Poligono(5, 4, "pentágono");
        // pentágono._tipo = "pentágono"; // Gera erro de acesso
        System.out.println(pentágono);
        System.out.println("Perímetro do pentágono: " + pentágono.calculaPerímetro());
        Retangulo retângulo = new Retangulo(3, 4);
        System.out.println(retângulo);
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());
        // se não criarmos um pacote para Polígono ou se este arquivo estiver no mesmo pacote
        // a linha a seguir não gera erro de acesso pois _lados é protected (acessível a todos no mesmo pacote)
        //retângulo._lados[0] = 10; 
        // note que isso viola a modularidade do código

        if (pentágono.éCompatívelCom(retângulo)) 
          System.out.println("Pentágono e retângulo são compatíveis");
        else
          System.out.println("Pentágono e retângulo não são compatíveis");

        Retangulo quadrado = new Retangulo(5);
        System.out.println(quadrado);
        System.out.println("Área do quadrado: " + quadrado.calculaÁrea());

        System.out.println("Foram criados " + Poligono.quantosPolígonos() + " polígonos");

        if (Poligono.sãoCompatíveis(quadrado, retângulo)) 
          System.out.println("Quadrado e retângulo são compatíveis");
        else
          System.out.println("Quadrado e retângulo não são compatíveis");

    }
}
