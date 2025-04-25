package poligonos;

public class TriânguloEquilátero extends Triângulo {
    public TriânguloEquilátero(int lado, String cor){
        super(lado,lado,lado,cor);
    }

    public void setLado1(int lado){
        super.setLado1(lado);
        super.setLado2(lado);
        super.setLado3(lado);
    }

    public void setLado2(int lado){
        setLado1(lado);
    }

    public void setLado3(int lado){
        setLado1(lado);
    }
}