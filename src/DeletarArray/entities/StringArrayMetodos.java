package DeletarArray.entities;

public class StringArrayMetodos {
    private Person[] vetor;
    private int Nelem;

    public StringArrayMetodos(int max) {
        vetor = new Person[max];
        Nelem = 0;
    }

    public Person find(String searchItem) {
        int j;
        for (j = 0; j < Nelem; j++) {
            if (vetor[j].getLast().equals(searchItem)) {
                break;
            }
        }
        if (j == Nelem) {
            return null;
        }

        return vetor[j];
    }

    public void insert(String last, String first, int age) {
        vetor[Nelem] = new Person(last, first, age);
        Nelem++;
    }

    public boolean delete(String searchItem) {
        int j;
        for (j = 0; j < Nelem; j++) {
            if (vetor[j].getLast().equals(searchItem)) {
                break;
            }
        }
        if (j == Nelem) {
            return false;
        } else {
            for (int k = j; k < Nelem; k++) {
                vetor[k] = vetor[k + 1];
            }
            Nelem--;
            return true;
        }

    }

    public void displayTwo() {
        for (int j = 0; j < Nelem; j++) {
            vetor[j].display();
        }
    }
}
