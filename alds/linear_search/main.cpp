//
//  main.cpp
//  linear_search
//
//  Created by tuxedocat on 1/14/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <iostream>
#include <vector>
using std::vector;
using std::for_each;
using std::cout;
using std::cin;

int LinearSearch(const vector<int> &V, const int key) {
  int i = 0;
  for (auto item : V) {
    i++;
    if (item == key) {
      return i;
    }
  }
  return -1;
}

int main() {
  int M, N, num_found;
  vector<int> V, A;
  cin >> M;
  for (int i = 0; i < M; i++) {
    int n;
    cin >> n;
    V.push_back(n);
  }
  cin >> N;
  for (int i = 0; i < N; i++) {
    int n;
    cin >> n;
    A.push_back(n);
  }

  num_found = 0;
  for (auto key : A) {
    if (LinearSearch(V, key) > 0) {
      num_found++;
    }
  }

  cout << num_found;

  return 0;
}