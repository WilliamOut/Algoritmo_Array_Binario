package DeletarArray.application;

import DeletarArray.entities.OrdArray;

public class MainArray {
    public static void main(String[] args) {
        int maxsize = 100;
        OrdArray a = new OrdArray(maxsize);

        a.insert(22);
        a.insert(33);
        a.insert(44);
        a.insert(55);
        a.insert(66);
        a.insert(77);
        a.insert(88);
        a.insert(99);
        
        a.display();
        
        int searchKey = 86;
        if(a.find(searchKey) != -1) {
        	System.out.println("Encontrado o número " + searchKey);
        }
        else {
        	System.out.println("Não encontrado o número " + searchKey);
        }
        
        
    }
}
