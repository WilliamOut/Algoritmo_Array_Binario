package Chap02.Array.entities;

public class ObSort {
    private String lastName;
    private String firstName;
    private int age;

    public ObSort(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLast(){
        return lastName;
    }

    public void display(){
        System.out.print("Last: " + lastName);
        System.out.print(", First: " + firstName);
        System.out.println(", Age: " + age);
    }

    public static class ObSortMethod{
	    private ObSort [] vetor;
	    private int n;
	
	    public ObSortMethod(int max){
	        vetor = new ObSort[max];
	        n = 0;
	    }
	
	    public void insert(String last, String first, int age){
	        vetor[n] = new ObSort(last, first, age);
	        n++;
	    }
	
	    public ObSort find(String key){
	        int j;
	        for(j=0;j<n;j++){
	            if(vetor[j].getLast().equals(key)){
	                break; 
	            }
	            }
	
	        if(j==n){
	            return null;
	        }
	    return vetor[j];
	    }
	
	    public boolean delete(String key){
	        int j,k;
	        for(j=0;j<n;j++){
	            if(vetor[j].getLast().equals(key)){
	                break;
	            }
	        }
	
	        if(j==n){
	            return false;
	        }
	
	        for(k=j;k<n;k++){
	            vetor[k] = vetor[k+1];
	        }
	        n--;
	        return true;
	
	        }
	
	    public void InsertionSort(){
	        int in, out;
	        for(out=1;out<n;out++){
	            ObSort temp = vetor[out];
	            in = out;
	                
	            while(in>0 && vetor[in-1].getLast().compareTo(temp.getLast())>0){
	                vetor[in] = vetor[in-1];
	                 --in;
	                }
	            vetor[in] = temp;
	        }
	    }
	
	    public void displayMethod(){
	        int j;
	        for(j=0;j<n;j++){
	            vetor[j].display();
	        }
	        }    
	    }
	}
