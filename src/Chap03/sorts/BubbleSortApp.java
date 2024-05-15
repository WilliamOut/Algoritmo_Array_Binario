package Chap03.sorts;

class ArrayBub{
    private long[]a;
    private int nElem;

    public ArrayBub(int max){
        a = new long[max];
        nElem = 0;
    }

    public void insert(long value){
        a[nElem] = value;
        nElem++;
    }

    public void display(){
        int j;
        for(j=0;j<nElem;j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void BubbleSort(){
        int out, in;
        for(out=nElem-1;out>=1;out--)
        	for(in=0;in<out;in++)
        		if(a[in]>a[in+1])
        			swap(in,in+1);
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}



public class BubbleSortApp {
    public static void main(String[] args) {
        int max_size = 10;
        ArrayBub vetor = new ArrayBub(max_size);

        vetor.insert(10);
        vetor.insert(9);
        vetor.insert(8);
        vetor.insert(7);
        vetor.insert(6);
        vetor.insert(5);
        vetor.insert(4);
        vetor.insert(3);
        vetor.insert(2);
        vetor.insert(1);

        vetor.display();

        vetor.BubbleSort();

        vetor.display();
    }
}
