//
//  main.cpp
//  stablesort_3-5
//
//  Created by tuxedocat on 1/9/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//
#include <stdio.h>
#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

struct Card {
  char suit;
  int value;
};

void ToString(struct Card V[], int N) {
  for (int i = 0; i < N; i++) {
    if (i > 0) {
      cout << " ";
    }
    cout << V[i].suit << V[i].value;
  }
  cout << endl;
}

int BubbleSort(struct Card A[], int N) {
  int num_swaps = 0;
  bool flag = true;
  for (int i = 0; flag; i++) {
    flag = false;
    for (int j = N - 1; j >= i + 1; j--) {
      if (A[j].value < A[j - 1].value) {
        swap(A[j], A[j - 1]);
        flag = true;
        num_swaps++;
      }
    }
  }
  return num_swaps;
}

int SelectionSort(struct Card A[], int N) {
  int num_swaps = 0;
  for (int i = 0; i < N; i++) {
    int minj = i;
    for (int j = i; j < N; j++) {
      if (A[j].value < A[minj].value) {
        minj = j;
      }
    }
    if (i != minj) {
      num_swaps++;
    }
    swap(A[i], A[minj]);
  }
  return num_swaps;
}

bool IsStable(struct Card A[], struct Card B[], int N) {
  for (int i = 0; i < N; i++) {
    if (A[i].suit != B[i].suit) {
      return false;
    }
  }
  return true;
}

int main() {
  int N, i;
  Card A1[100], A2[100];

  cin >> N;
  for (int i = 0; i < N; i++) {
    cin >> A1[i].suit >> A1[i].value;
  }

  for (int i = 0; i < N; i++) {
    A2[i] = A1[i];
  }

  int num_swaps_stable = BubbleSort(A1, N);
  ToString(A1, N);
  cout << "Stable" << endl;
  int num_swaps = SelectionSort(A2, N);
  ToString(A2, N);
  if (IsStable(A1, A2, N)) {
    cout << "Stable" << endl;
  } else {
    cout << "Not stable" << endl;
  }
  return 0;
}