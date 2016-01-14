//
//  main.cpp
//  queue
//
//  Created by tuxedocat on 1/11/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <vector>

int min(int a, int b) { return a < b ? a : b; }

typedef struct proc {
  std::string name;
  int t;
} Proc;

class ProcQueue {
 public:
  ProcQueue(std::vector<Proc> procs, int n) {
    head = 1;
    tail = n + 1;
    for (int i = 1; i <= n; i++) {
      Q.push_back(procs[i]);
    };
  }

  bool is_empty() { return head == tail; }
  bool is_full() { return head == (tail + 1) % MAX; }
  void enqueue(Proc x) {
    Q[tail] = x;
    tail = (tail + 1) % MAX;
  }

  Proc dequeue() {
    Proc x = Q[head];
    head = (head + 1) % MAX;
    return x;
  }

 private:
  int head;
  int tail;
  const int MAX = 100005;
  std::vector<Proc> Q;
};

int main() {
  int elaps = 0, c;
  int i, q, n;
  std::vector<Proc> prs;
  scanf("%d %d", &n, &q);
  for (i = 1; i <= n; i++) {
    std::string name;
    int time;
    std::cin >> name >> time;
    Proc u = {name, time};
    prs.push_back(u);
  }
  ProcQueue procq(prs, n);

  while (!procq.is_empty()) {
    Proc u = procq.dequeue();
    c = min(q, u.t);
    u.t -= c;
    elaps += c;
    if (u.t > 0) {
      std::cout << u.name << " " << elaps << std::endl;
      procq.enqueue(u);
    } else {
      std::cout << u.name << " " << elaps << std::endl;
    }
  }
  return 0;
}