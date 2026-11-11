package teste;

import dominio.Animal;

public class AnimalTeste01 {
    static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.nome="Macaco prego";
        animal1.raca="Sapajus libidinosus";
        animal1.idade=40;
        animal2.nome="Onça pintada";
        animal2.raca="Panthera onca";
        animal2.idade=20;
        System.out.printf("""
                animal1
                nome:%s
                raca:%s
                idade:%d
                ----------------------
                animal2
                nome:%s
                raca:%s
                idade:%d
                """,animal1.nome,animal1.raca,animal1.idade,animal2.nome,animal2.raca,animal2.idade);
    }
}
