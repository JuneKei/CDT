#include <iostream>
#include <memory.h>

using namespace std;

int solution(int n) {
	int cnt = 0;
	bool* arr = new bool[n + 1];

	memset(arr, true, (n + 1) * sizeof(bool));

	// 소수가 아닌 값 배열에 담기
	for (int i = 2; i * i <= n; i++) {
		for (int j = i * i; j <= n; j += i) {
			arr[j] = false;
		}
	}

	for (int i = 2; i < n + 1; i++) {
		if (arr[i]) {
			cnt++;
			cout << "";
		}

	}
	return cnt;
}