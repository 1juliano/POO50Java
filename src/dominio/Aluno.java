package dominio;

public class Aluno {
    public String nome;
    public int nota1;
    public int nota2;
    public double media;

    public String getSituacao() {
        if (media >= 7) {
            return ("aprovado");
        } else if (media >= 5) {
            return ("recuperacao");
        } else {
            return ("reprovado");
        }
    }

    public void calcularMedia(double nota1,double nota2){
         media=(nota1+nota2)/2;
        System.out.println(media);
    }
    public void isAprovado(double media){
            if(media>=7){
                System.out.println("e vc foi aprovado");
            }else{
                System.out.println("e vc foi reprovado");
            }
    }
    public void imprimirSituacao(){
        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media >= 5) {
            System.out.println("recuperacao");
        } else {
            System.out.println("reprovado");
        }

    }
    public void atualizarNotas(double novaNota1, double novaNota2) {
        nota1 = (int) novaNota1;
        nota2 = (int) novaNota2;

        calcularMedia(nota1, nota2);

    }}
