package DeletarArray.entities;

public class OrdArray {
    private long[] a;
    private int Nelemens;

    public OrdArray(int max){
        a = new long[max];
        Nelemens = 0;
    }
    
    public int size() {
    	return Nelemens;
    }

    public int find(long key) {
    	int lowerPiece = 0;				// parte inicial
    	int upperPiece = Nelemens - 1;  // tamanho completo dos elementos
    	int LineOfPiece;  // metade
    	
    	while(lowerPiece <= upperPiece) {
    		LineOfPiece = (lowerPiece + upperPiece)/2;	// achar o calculo da metade
    		
    		if(a[LineOfPiece] == key) {
    			return LineOfPiece;			//bloco de encontro
    		}
    		else if(lowerPiece>key){
    			return Nelemens;			// se a menor parte for mair que a chave, acabou, reinicie
    		}
    		else {
    			if(a[LineOfPiece] < key) {
    				lowerPiece = LineOfPiece + 1;	// está na parte superior 
    			}
    			else {
    				upperPiece = LineOfPiece - 1;	// está na parte inferior
    			}
    		}
    	}
    	return -1;
    }
    

    public void insert(long value) {
    	int j;
    	for(j=0;j<Nelemens;j++) {
    		if(a[j] > value) {
    			break;
    		}
    	}
    	for(int k=Nelemens;k>j;k--) {
    		a[k] = a[k-1];
    	}
    	
    a[j] = value;
    Nelemens++;
    }

    public boolean delete(long value_delete){
        int j = find(value_delete);
        
        if(j==Nelemens) {
        	return false;
        }
        else {
        	for(int k=j;k<Nelemens;k++) {
        		a[k] = a[k+1];
        	}
        Nelemens--;
        return true;
        }
    }
    
    public void display(){
        for(int j=0;j<Nelemens;j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
}
