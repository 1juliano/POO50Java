package teste;

import dominio.Celular;

public class CelularTeste01 {
    static void main(String[] args) {
        Celular celular = new Celular();
        Celular celular2 = new Celular();
        celular.marca="Iphone";
        celular.modelo="Smartphone";
        celular.armazenamento=512;
        celular.preco=550;
        celular2.marca="Xiaomi";
        celular2.modelo="Smartphone";
        celular2.armazenamento=512;
        celular2.preco=350;
        System.out.printf("Celular %s, %s com %d GB custa R$ %.2f %n",celular.marca,celular.modelo,celular.armazenamento,celular.preco);
        System.out.printf("Celular %s, %s com %d GB custa R$ %.2f %n",celular2.marca,celular2.modelo,celular2.armazenamento,celular2.preco);
        boolean resultado=celular.isPremium(celular.preco);
        System.out.println(resultado);
        boolean resultado2=celular2.isPremium(celular2.preco);
        System.out.println(resultado2);
    }
}
