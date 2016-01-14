//
//  main.cpp
//  binary_search
//
//  Created by Yu Sawai on 1/14/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <iostream>
#include <vector>

int BinarySearch(const std::vector<int> &V, const int key) {
  int left = 0;
  int right = V.size();
  while (left < right) {
    int mid = (left + right) / 2;
    if (V[mid] == key) {
      return mid + 1;
    } else if (key < V[mid]) {
      right = mid;
    } else {
      left = mid + 1;
    }
  }
  return -1;
}

int main() {
  using namespace std;
  int M, N, num_found;
  vector<int> V, A;
  cin >> M;
  for (int i = 0; i < M; i++) {
    int n;
    cin >> n;
    V.push_back(n);
  }
  sort(V.begin(), V.end());

  cin >> N;
  for (int i = 0; i < N; i++) {
    int n;
    cin >> n;
    A.push_back(n);
  }

  num_found = 0;
  for (auto key : A) {
    if (BinarySearch(V, key) > 0) {
      num_found++;
    }
  }

  cout << num_found;

  return 0;
}