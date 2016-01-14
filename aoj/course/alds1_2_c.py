def _get_val(card):
    return int(card[1:])


def bubble_sort(arr):
    N = len(arr)
    _arr = arr[:]
    flag = True

    while flag:
        flag = False
        for j in range(N - 1, 0, -1):
            if _get_val(_arr[j]) < _get_val(_arr[j - 1]):
                _arr[j], _arr[j - 1] = _arr[j - 1], _arr[j]
                flag = True
    return _arr


def selection_sort(arr):
    N = len(arr)
    _arr = arr[:]
    for i in range(N):
        min_j = i
        for j in range(i, N):
            if _get_val(_arr[j]) < _get_val(_arr[min_j]):
                min_j = j

        if i != min_j:
            _arr[i], _arr[min_j] = _arr[min_j], _arr[i]
    return _arr


def is_stable(arr, arr_sorted):
    stable_sort = bubble_sort
    reference = stable_sort(arr)
    for ref, tgt in zip(reference, arr_sorted):
        if ref != tgt:
            return False
    return True


def output(x):
    return "Stable" if x else "Not stable"


def main():
    N = int(input())
    arr = input().strip().split()
    bubble_sorted = bubble_sort(arr)
    selection_sorted = selection_sort(arr)
    print(" ".join(map(str, bubble_sorted)))
    print(output(is_stable(arr, bubble_sorted)))
    print(" ".join(map(str, selection_sorted)))
    print(output(is_stable(arr, selection_sorted)))


def test():
    test1 = "H4 C9 S4 D2 C3"
    test2 = "S1 H1"
    print(test1)
    print(bubble_sort(test1.split()))
    print(selection_sort(test1.split()))
    print(output(is_stable(test1.split(), selection_sort(test1.split()))))
    print(test2)
    print(bubble_sort(test2.split()))
    print(selection_sort(test2.split()))
    print(output(is_stable(test2.split(), selection_sort(test2.split()))))


if __name__ == '__main__':
    main()
