package co.micol.exam1001;

public class App {
	private static int[] a = { 7, 3, 6, 1, 4, 2, 5, 8, 9, 10 };

	public static void main(String[] args) {
//		 System.out.println( "Hello World!" );
//		selectionSort();
//		toPrint();
//
//		System.out.println("=====================");
//		newSelectionSort();
//		toPrint();
		RankAgorithm rankAgorithm = new RankAgorithm();
		rankAgorithm.toString();
		
	}
	
	private static String toPrint() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		return null;
	}

	private static void selectionSort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { //오름차순
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

//    private static void selectionSort() {
//    	for(int i =0; i<a.length-1; i++) {
//    		for(int j = i+1; j < a.length; j++) {
//    			if(a[i] < a[j]) { //Desc Sort 내림차순
//    				int temp = a[i];
//    				a[i] = a[j];
//    				a[j] = temp;
//    			}
//    		}
//    	}
//    }

	private static void newSelectionSort() {
		int min; // 인덱스의 위치값을 기억할 변수
		int temp; // 최근에 많이 쓰는 sort 방법.
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] < a[j])
					min = j; // Desc sort 내림차순
			}

			if (i != min) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}

	}
}
