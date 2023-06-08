package ssorrt;

public class BBubleSSOrt {
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {3, 2, 5, 1, 6, 8};
		System.out.print("[");
		for(int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		
		
		
		// 버블 정렬
		for(int i =0; i< arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
	}
}
