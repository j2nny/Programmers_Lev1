package level1;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12950

public class MatrixSum {

	public MatrixSum() {
		solution(new int[][] {new int[] {1, 2}, new int[] {2, 3}}, new int[][] {new int[] {3, 4}, new int[] {5, 6}});
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length] ;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		new MatrixSum();
	}
}
