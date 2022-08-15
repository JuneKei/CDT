package Level2;

class Solution {
    static int[] queen;
	static int N;
	static int answer;
    
    public int solution(int n) {
        N= n;
        queen = new int[N];
        
        //행 0번째로 시작
        backtrack(0);
        return answer;
    }

    static void backtrack(int row) {
		// 전체 배치가 왼료 되었을때 answer + 1
        if (N == row) {
			answer++;
			return;
		}
        
        // 0행부터 N행까지 
		for (int i = 0; i < N; i++) { 
            //행 배열에서 계속적으로 + 1
            queen[row] = i;

            // 현재 row행에서 퀸 배치가 가능하다면 
			if (placeQueen(row)) { 
				backtrack(row + 1);
			} 
		}
	}

	static boolean placeQueen(int col) {
		// 지금 row행에 놓은 퀸이 이전 퀸들에 영향을 안받는 자리에 있는지 확인
		for (int i = 0; i < col; i++) {
			// 현재 row 위치에 퀸이 있음
			if (queen[col] == queen[i])
				return false;
			// 대각선 위치 확인
			if (Math.abs(col - i) == Math.abs(queen[i] - queen[col])) {
				return false;
			}
		}
		return true;
	}
}