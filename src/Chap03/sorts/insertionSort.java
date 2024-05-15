package Chap03.sorts;

class sortInsertion {
    private long[] a;
    private int n;

    public sortInsertion(int max) {
        a = new long[max];
        n = 0;
    }

    public void insert(long value) {
        a[n] = value;
        n++;
    }

    public int find(long key) {
        int lower = 0;
        int upper = n - 1;
        int middle;

        while (lower <= upper) {
            middle = (upper + lower) / 2;

            if(a[middle]==key){
                return middle;
            }

            else if(lower>upper){
                return n;
            }

            else{
                if(a[lower]<key){
                    lower = middle + 1;
                }

                else{
                    upper = middle - 1;
                }
            }
        }
        return -1;
}

    public boolean delete(long value) {
        int j = find(value);

        if (j == n) {
            return false;
        } else {
            for (int k = j; k < n - 1; k++) {
                a[k] = a[k + 1];
            }
            n--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }
    }

    public void SortInsert() {
        int in, out;

        for(out=1;out<n;out++){
            long temp = a[out];
            in = out;

            while(in>0 && a[in-1] > temp){
                a[in] = a[in-1];
                --in;
            }

        a[in] = temp;
        }
    }
}

public class insertionSort {
    public static void main(String[] args) {
        int max = 10;
        sortInsertion arr = new sortInsertion(max);

        arr.insert(33);
        arr.insert(55);
        arr.insert(11);
        arr.insert(44);
        arr.insert(77);
        arr.insert(22);
        arr.insert(88);
        arr.insert(99);
        arr.insert(00);
        arr.insert(111);

        arr.SortInsert();
        arr.display();
    }
}
