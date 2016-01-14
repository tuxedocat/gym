//
//  main.cpp
//  doubly_linked_list
//
//  Created by tuxedocat on 1/11/16.
//  Copyright © 2016 tuxedocat. All rights reserved.
//

#include <algorithm>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
#include <vector>

struct Node {
  int key;
  Node *next, *prev;
};

// 番兵
Node *nil;

Node *ListSearch(int key) {
  Node *cur = nil->next;
  while (cur != nil && cur->key != key) {
    cur = cur->next;
  }
  return cur;
}

void Init() {
  nil = (Node *)malloc(sizeof(Node));
  nil->next = nil;
  nil->prev = nil;
}

void PrintList() {
  Node *cur = nil->next;
  int isf = 0;
  while (true) {
    if (cur == nil) {
      break;
    }
    if (isf++ > 0) {
      printf(" ");
    }
    printf("%d", cur->key);
    cur = cur->next;
  }
  printf("\n");
}

void DeleteNode(Node *t) {
  if (t == nil) {
    return;
  }
  t->prev->next = t->next;
  t->next->prev = t->prev;
  free(t);
}

void DeleteFirst() { DeleteNode(nil->next); }

void DeleteLast() { DeleteNode(nil->prev); }

void DeleteKey(int key) { DeleteNode(ListSearch(key)); }

void Insert(int key) {
  Node *x = (Node *)malloc(sizeof(Node));
  x->key = key;
  x->next = nil->next;
  nil->next->prev = x;
  nil->next = x;
  x->prev = nil;
}

int main() {
  int key, n, i;
  int size = 0;
  char com[20];
  int np = 0, nd = 0;
  scanf("%d", &n);
  Init();
  for (i = 0; i < n; i++) {
    scanf("%s%d", com, &key);
    if (com[0] == 'i') {
      Insert(key);
      np++;
      size++;
    } else if (com[0] == 'd') {
      if (strlen(com) > 6) {
        if (com[6] == 'F') {
          DeleteFirst();
        } else if (com[6] == 'L') {
          DeleteLast();
        }
      } else {
        DeleteKey(key);
        nd++;
      }
      size--;
    }
  }
  PrintList();
  return 0;
}