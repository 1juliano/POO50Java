package dominio;

public class Funcionario {
    public String nome;
    public double salario;

    public double calcularBonus(double porcentagemBonus) {
        double porcentagem = salario * porcentagemBonus / 100;
        return porcentagem;
    }

}
