def selection_sort(arr, N):
    _arr = arr[:]
    n_swap = 0
    for i in range(N):
        min_j = i
        for j in range(i, N):
            if _arr[j] < _arr[min_j]:
                min_j = j

        if i != min_j:
            _arr[i], _arr[min_j] = _arr[min_j], _arr[i]
            n_swap += 1
    return _arr, n_swap


def main():
    N = int(input())
    arr = [int(i) for i in input().strip().split()]
    sorted_, n_swap = selection_sort(arr, N)
    print(" ".join(map(str, sorted_)))
    print(n_swap)


def test():
    print(selection_sort([5, 6, 4, 2, 1, 3], 6))
    print(selection_sort([5, 2, 4, 6, 1, 3], 6))


if __name__ == '__main__':
    main()
