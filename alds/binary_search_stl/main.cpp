//
//  main.cpp
//  binary_search_stl
//
//  Created by tuxedocat on 1/19/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdio>
#include <iostream>
#include <vector>

int main() {
  using namespace std;
  vector<int> A;
  int n;

  cin >> n;
  for (int i = 0; i < n; i++) {
    int m;
    scanf("%d", &m);
    A.push_back(m);
  }

  int q, k, sum = 0;
  cin >> q;
  for (int i = 0; i < q; i++) {
    scanf("%d", &k);
    if (*lower_bound(A.begin(), A.end(), k) == k) {
      sum++;
    }
  }
  cout << sum << endl;
  return 0;
}