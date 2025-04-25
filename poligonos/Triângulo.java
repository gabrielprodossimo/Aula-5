package poligonos;

public class Triângulo extends Poligono {
 
    private String Cor;

    public Triângulo(int lado1, int lado2, int lado3, String cor){
        super(new int[]{lado1,lado2,lado3}, "triângulo");
        Cor = cor;
        validarTriângulo();
    }
    private void validarTriângulo(){
        if (!(_lados[0]>0&&_lados[1]>0&&_lados[2]>0&&((_lados[0]+_lados[1])>_lados[2]&&(_lados[0]+_lados[2])>_lados[1]&&(_lados[2]+_lados[1])>_lados[0]))){
            System.out.println("Triângulo inválido!");
        }
    }

    public double calculaÁrea(){
        double Área, s;
        s = (_lados[0]+_lados[1]+_lados[2])/2;
        Área = Math.sqrt(s*(s-_lados[0])*(s-_lados[1])*(s-_lados[2]));
        return Área;
    }

    public void setCor(String cor){
        Cor = cor;
    }

    public String getCor(){
        return Cor;
    }

    public void setLado1(int lado1){
        _lados[0]=lado1;
    }
    public void setLado2(int lado2){
        _lados[1]=lado2;
    }
    public void setLado3(int lado3){
        _lados[2]=lado3;
    }

    public int getLado1(){
        return _lados[0];
    }
    public int getLado2(){
        return _lados[1];
    }
    public int getLado3(){
        return _lados[2];
    }
}
