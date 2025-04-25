package poligonos;

public class TriânguloIsósceles extends Triângulo {
    public TriânguloIsósceles(int ladosIguais, int ladoDiferente, String cor){
        super(ladosIguais,ladosIguais,ladoDiferente,cor);
    }

    public void setLado1(int lado){
        super.setLado1(lado);
        super.setLado2(lado);
    }
    public void setLado2(int lado){
        setLado1(lado);
    }

    public void setLado3(int lado){ //lado diferentao
        super.setLado3(lado);
    }
}

