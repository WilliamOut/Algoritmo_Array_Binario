package Chap02.Array.application;

import Chap02.Array.entities.ObSort;
import Chap02.Array.entities.ObSort.ObSortMethod;

public class MainObSort {
    public static void main(String[] args) {
        int max_size = 10;
        ObSortMethod vetor;
        vetor = new ObSortMethod(max_size);
        
        vetor.insert("Gonçalves", "Waldemicio", 57);
        vetor.insert("Araujo","William",20);
        vetor.insert("Santana", "Valdirene", 50);
        vetor.insert("Silva", "Jean", 11);
        
        System.out.println("BEFORE SORTING");
        vetor.displayMethod();
        
        vetor.InsertionSort();
        System.out.println("AFTER SORTING");
        vetor.displayMethod();
        
        String key = "Araujo";
        ObSort found = vetor.find(key);
        System.out.println("FINDING AN ELEMENT");
        if(found != null) {
        	System.out.println(key + " was found in the data");
        }
        else {
        	System.out.println(key + " wasn't found");
        }
        
        vetor.delete(key);
        System.out.println("DELETING AN ELEMENT");
        vetor.displayMethod();
        
    }
}
