//
//  main.cpp
//  shellsort
//
//  Created by tuxedocat on 1/10/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <stdio.h>
#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
long long cnt;
int l;
vector<int> A;
vector<int> G;
int n;

void ToString(vector<int> &V) {
  for (vector<int>::const_iterator it = V.begin(); it != V.end(); ++it) {
    printf("%d ", *it);
  }
  printf("\n");
}

void InsertionSort(vector<int> &V, int n, int g) {
  for (int i = g; i < n; i++) {
    int v = V[i];
    int j = i - g;
    while (j >= 0 && V[j] > v) {
      V[j + g] = V[j];
      j -= g;
      cnt++;
    }
    V[j + g] = v;
  }
}

void ShellSort(vector<int> &V, int n) {
  for (int h = 1;;) {
    if (h > n) {
      break;
    }
    G.push_back(h);
    h = 3 * h + 1;
  }
  reverse(G.begin(), G.end());

  for (int i = 0; i < G.size(); i++) {
    InsertionSort(V, n, G[i]);
  }
}

int main() {
  vector<int> V;
  cnt = 0;

  cin >> n;
  for (int i = 0; i < n; i++) {
    int num;
    cin >> num;
    V.push_back(num);
  }

  ShellSort(V, n);

  cout << G.size() << endl;
  ToString(G);
  cout << cnt << endl;

  for (int i = 0; i < n; i++) {
    cout << V[i] << endl;
  }

  return 0;
}
