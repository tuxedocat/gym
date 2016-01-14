//
//  main.cpp
//  insertionsort
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

void InsertionSort(vector<int> A, int N) {
  for (int i = 0; i < N; i++) {
    int v = A[i];
    int j = i - 1;
    while (j >= 0 && A[j] > v) {
      A[j + 1] = A[j];
      j--;
    }
    A[j + 1] = v;
    ToString(A);
  }
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

  ToString(A);
  InsertionSort(A, N);

  return 0;
}