
public class arrayDemo {

	public static void main(String[] args) {
		singleDimensionArray();
		int b[][] = {{1, 5, 8, 9},{1, 3, 6, 8, 9, 10}};
		System.out.println("element at 1st row- 4th column is : "+ b[1][4]);
	}
		public static void singleDimensionArray() {
			int a[] = {2, 5, 66, 71, 90};
			for(int i=0; i<a.length ; i++) {
				System.out.println("element at index " + i + " is : "+a[i] );
			}

	}

}
