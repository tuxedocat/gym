//
//  main.cpp
//  selectionsort
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

int SelectionSort(vector<int> A, int N) {
  int num_swaps = 0;
  for (int i = 0; i < N; i++) {
    int minj = i;
    for (int j = i; j < N; j++) {
      if (A[j] < A[minj]) {
        minj = j;
      }
    }
    if (i != minj) {
      num_swaps++;
    }
    swap(A[i], A[minj]);
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

  int num_swaps = SelectionSort(A, N);
  cout << num_swaps << endl;
  return 0;
}