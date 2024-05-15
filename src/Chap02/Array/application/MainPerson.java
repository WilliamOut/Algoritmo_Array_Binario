package Chap02.Array.application;

import Chap02.Array.entities.Person;
import Chap02.Array.entities.StringArrayMetodos;

public class MainPerson {
    public static void main(String[] args) {
        int max_size = 100;
        StringArrayMetodos vetor = new StringArrayMetodos(max_size);

        vetor.insert("Araujo", "William", 20);
        vetor.insert("Silva", "João", 25);
        vetor.insert("Santos", "Maria", 30);
        vetor.insert("Ferreira", "Carlos", 35);
        vetor.insert("Oliveira", "Ana", 28);
        vetor.insert("Rodrigues", "Pedro", 22);
        vetor.insert("Costa", "Sandra", 40);
        vetor.insert("Pereira", "Paulo", 33);
        vetor.insert("Martins", "Laura", 29);
        vetor.insert("Rocha", "Mariana", 27);
        vetor.insert("Gomes", "Luiz", 31);
        vetor.insert("Almeida", "Camila", 26);
        vetor.insert("Nascimento", "Lucas", 24);
        vetor.insert("Araujo", "Gabriel", 23);
        vetor.insert("Lima", "Fernanda", 32);
        vetor.insert("Carvalho", "Luisa", 34);
        vetor.insert("Mendes", "Rafael", 29);
        vetor.insert("Dias", "Patricia", 38);
        vetor.insert("Marques", "Eduardo", 37);
        vetor.insert("Barbosa", "Isabela", 36);

        vetor.delete("Barbosa");
        vetor.displayTwo();

        String key = "Paul";
        Person found;
        found = vetor.find(key);

        if (found != null) {
            System.out.println("Found " + key);
        } else {
            System.out.println("Can't found " + key);
        }

    }
}
