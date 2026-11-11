package teste;

import dominio.Funcionario;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome="Juliano";
        funcionario.salario=7000;
        double resultado= funcionario.calcularBonus(10);
        System.out.println(funcionario.salario + resultado);
    }
}
