//
//  main.cpp
//  bubblesort
//
//  Created by tuxedocat on 1/8/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <stdio.h>
#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

void ToString(vector<int> V) {
  for (vector<int>::iterator it = V.begin(); it != V.end(); ++it) {
    printf("%d", *it);
  }
  printf("\n");
}

int BubbleSort(vector<int> A, int N) {
  int num_swaps = 0;
  bool flag = true;
  for (int i = 0; flag; i++) {
    flag = false;
    for (int j = N - 1; j >= i + 1; j--) {
      if (A[j] < A[j - 1]) {
        swap(A[j], A[j - 1]);
        flag = true;
        num_swaps++;
      }
    }
  }
  ToString(A);
  return num_swaps;
}

int main() {
  int N, i;
  vector<int> A;

  cin >> N;
  for (i = 0; i < N; i++) {
    int n;
    scanf("%d", &n);
    A.push_back(n);
  }

  int num_swaps = BubbleSort(A, N);
  cout << num_swaps << endl;
  return 0;
}