//
//  main.cpp
//  stack
//
//  Created by tuxedocat on 1/11/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <vector>

class Stack {
 public:
  int top;
  std::vector<int> S;

  Stack() {
    top = 0;
    S.reserve(1000);
  }

  void push(int x) { S[++top] = x; }

  int pop() {
    top--;
    return S[top + 1];
  }

  void show() {
    std::cout << "Stack:" << std::endl;
    std::cout << "top = " << Stack::top << std::endl;
    for (std::vector<int>::const_iterator it = S.begin(); it != S.end(); ++it) {
      std::cout << *it << " ";
    }
    std::cout << std::endl;
  }
};

int main() {
  int a, b;
  Stack s;
  char cs[100];
  while (scanf("%s", cs) != EOF) {
    if (cs[0] == '+') {
      a = s.pop();
      b = s.pop();
      s.push(a + b);
    } else if (cs[0] == '-') {
      b = s.pop();
      a = s.pop();
      s.push(a - b);
    } else if (cs[0] == '*') {
      a = s.pop();
      b = s.pop();
      s.push(a * b);
    } else {
      s.push(atoi(cs));
    }
  }
  int result = s.pop();
  std::cout << "Result:" << std::endl;
  std::cout << result << std::endl;
  return 0;
}