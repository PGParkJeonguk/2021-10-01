package co.micol.exam1001;

public class RankAgorithm {
	private int[] grade = {80,100,90,70,60};
	private int[] rank;
	
	private void rank() {
		rank = new int[grade.length];
		for(int i=0; i < rank.length; i++) {	//rank 배열 초기화
			rank[i] = 1;
		}
		
		for(int i = 0; i< grade.length -1 ; i++) {
			for(int j = i+1; j<grade.length ; j++) {
				if(grade[i] > grade[j]) {
					rank[j] ++;
				}else if(grade[i] < grade[j]){
					rank[i] ++;
				}
			}
		}
	}
	
	public String toString() { //보다 나은 for문는 출력문에서 쓴다.(통상 forEach구문이라고 부른다.) 주로 값을 읽을때 쓴다.
		rank();
		for(int g : grade) {
			System.out.print(g + " ");
		}
		System.out.println();
		for(int r : rank) {
			System.out.print(r + " ");
		}
		return null;
	}
}
