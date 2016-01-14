//
//  main.cpp
//  queue_stl
//
//  Created by tuxedocat on 1/11/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdlib>
#include <iostream>
#include <queue>
#include <string>

int main() {
  int n, q, t;
  std::string name;
  std::queue<std::pair<std::string, int>> Q;
  std::cin >> n >> q;

  for (int i = 0; i < n; i++) {
    std::cin >> name >> t;
    Q.push(make_pair(name, t));
  }

  std::pair<std::string, int> u;
  int elaps = 0, a;

  while (!Q.empty()) {
    u = Q.front();
    Q.pop();
    a = std::min(u.second, q);
    u.second -= a;
    elaps += a;
    if (u.second > 0) {
      Q.push(u);
    } else {
      std::cout << u.first << " " << elaps << std::endl;
    }
  }
  return 0;
}