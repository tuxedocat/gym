//
//  main.cpp
//  stack_stl
//
//  Created by tuxedocat on 1/11/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdlib>
#include <iostream>
#include <stack>

int main() {
  using namespace std;
  stack<int> S;
  int a, b, x;
  string s;

  while (cin >> s) {
    if (s[0] == '+') {
      a = S.top();
      S.pop();
      b = S.top();
      S.pop();
      S.push(a + b);
    } else if (s[0] == '-') {
      b = S.top();
      S.pop();
      a = S.top();
      S.pop();
      S.push(a - b);
    } else if (s[0] == '*') {
      a = S.top();
      S.pop();
      b = S.top();
      S.pop();
      S.push(a * b);
    } else {
      S.push(atoi(s.c_str()));
    }
  }
  cout << S.top() << endl;
  return 0;
}