package polígonos;

public class Triângulo extends Polígono {
 
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

    public double calcularÁrea(){
        double Área, s;
        s = (_lados[0]+_lados[1]+_lados[2])/2;
        Área = Math.sqrt(s*(s-_lados[0])*(s-_lados[1])*(s-_lados[2]));
        return Área;
    }
}
