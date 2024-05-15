package Chap03.sorts;

class SelectSort {
	private long[]a;
	private int Nelem;
	
	public SelectSort(int max) {
		a = new long[max];
		Nelem = 0;	
	}
	
	public void insert(long value) {
		a[Nelem] = value;
		Nelem++;
	}
	
	public int find(long value) {
		int lower = 0;
		int upper = Nelem - 1;
		int middle;
		
		while(lower<=upper) {
			middle = (upper + lower) / 2;
			
			if(a[middle] == value) {
				return middle;
			}
			
			else if(lower>upper) {
				return Nelem;
			}
			
			else {
				if(a[middle]<value) {
					lower = middle + 1;
				}
				else {
					upper = middle - 1;
				}
			}
		}
		return -1;
	}
	public boolean delete(long value) {
		int i = find(value);
		
		if(i == Nelem) {
			return false;
		}
		
		else {
			for(int k=i;k<Nelem-1;k++) {
				a[k] = a[k+1];
			}
		Nelem--;
		return true;
		
	}
	}
	
	public void swap(int x, int y) {
		long temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public void SortSelect() {
		int out, in, min;
		for(out=0;out<Nelem;out++){
			min = out;
			for(in=out+1;in<Nelem;in++){
				if(a[in]<a[min]){
					min = in;
				}
			}
			swap(out, min);
		}
	}
	
	public void display() {
		int i;
		for(i=0;i<Nelem;i++) {
			System.out.print(a[i] + " ");
		}
	}
}

	public class SelectSortApp{
		public static void main(String[] args) {
		int max = 10;
		SelectSort arr = new SelectSort(max);
		

		
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

		System.out.println("DESORDENADO");
		System.out.println("\n*********************************************");
		arr.display();
		System.out.println("");
		System.out.println("*********************************************");
		
		arr.SortSelect();
		
		
		
		System.out.println("");
		System.out.println("");

		long key = 55;
		System.out.println("VERIFICANDO SE ITEM " + key + " ESTÁ NO ARRAY");
		System.out.println("\n*********************************************");
		if(arr.find(key) != -1) {
			System.out.println("Found " + key);
		}
		else {
			System.out.println("Can't found " + key);
		}
		System.out.println("\n*********************************************");

		System.out.println("");
		System.out.println("");
		System.out.println("ORDENADO");
		System.out.println("\n*********************************************");
		arr.display();
		System.out.println("");
		System.out.println("*********************************************");
		

		System.out.println("");
		System.out.println("");
		
		long deletekey = 88;
		System.out.println("DELETANDO O NUMERO " + deletekey);
		System.out.println("\n*********************************************");
		arr.delete(deletekey);
		arr.display();
		System.out.println("");
		System.out.println("*********************************************");
		
		
		
		}
	}
