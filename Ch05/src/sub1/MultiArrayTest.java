package sub1;

/*
 * 날짜 : 2020/04/29
 * 이름 : 권기민
 * 내용 : 자바 배열 기초 실습하기 
 */

public class MultiArrayTest {

	public static void main(String[] args) {
		
		// 1차원 배열
		int[] scores = { 80, 60, 78, 62, 92 };			// 배열 이름을 정할 때 복수로 정의하는 룰이 있다.
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			
			sum += scores[i];
		}
		
		/*
		 * 배열의 반복문
		 * for(int score : scores ) {
		 * 	sum += score;
		 * }
		 */
		
		System.out.println("배열 scores의 총합 : " + sum);
		
		
		
		// 2차원 배열
		int arr2d[][] = {{1,  2,  3,  4}, 
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}};
		
		for(int a = 0; a < arr2d.length; a++) {
			
			for(int b = 0; b < arr2d[a].length; b++) {

				System.out.println("배열 arr2d의 "+ (a + 1) +"행 " + (b + 1) + "열 원소 : " + arr2d[a][b]);
			}
		}
		
		
		
		// 3차원 배열
		int arr3d[][][] = {{{ 1,  2,  3}, 
			                { 4,  5,  6}, 
			                { 7,  8,  9}, 
			                {10, 11, 12}},
						   {{13, 14, 15}, 
			                {16, 17, 18}, 
			                {19, 20, 21}, 
			                {22, 23, 24}},
						   {{25, 26, 27}, 
			                {28, 29, 30}, 
			                {31, 32, 33}, 
			                {34, 35, 36}}};
		
		System.out.println("3차원 배열 1면 1행 1열 : " + arr3d[0][0][0]);
		System.out.println("3차원 배열 1면 3행 3열 : " + arr3d[0][2][2]);
		System.out.println("3차원 배열 2면 1행 2열 : " + arr3d[1][0][1]);
		System.out.println("3차원 배열 2면 3행 3열 : " + arr3d[1][2][2]);
		System.out.println("3차원 배열 3면 1행 3열 : " + arr3d[2][0][2]);
		System.out.println("3차원 배열 3면 4행 3열 : " + arr3d[2][3][2]);
		
		// 3차원 배열에서 3중 for문은 너무 복잡하기 때문에 잘 쓰이지 않는다.
		
	}
	
}
