def insertion_sort(arr, g):
    """In-place sorting"""
    global cnt
    for i in range(g, len(arr)):
        key = arr[i]
        j = i - g
        while (j >= 0) and (arr[j] > key):
            arr[j + g] = arr[j]
            j -= g
            cnt += 1
        arr[j + g] = key


def gapgen(n):
    if n == 1:
        return [1]
    gaps = []
    tmp = 0
    for i in range(n):
        if i == 1:
            gaps.append(i)
            tmp = i
        elif i == 3 * tmp + 1:
            gaps.append(i)
            tmp = i
    gaps.reverse()
    return gaps[:100]


def shell_sort(arr):
    global cnt
    cnt = 0
    gaps = gapgen(len(arr))

    # output 1: num of gap candidates
    print(len(gaps))
    # output 2: gaps
    print(" ".join(map(str, gaps)))

    for g in gaps:
        insertion_sort(arr, g)

    # output 3: last value of `cnt`
    print(cnt)
    # output 4: sorted array
    for v in arr:
        print(v)


def solve():
    N = int(input().strip())
    arr = []
    for i in range(N):
        arr.append(int(input().strip()))
    _sorted = shell_sort(arr)


def test():
    test1 = [5, 1, 4, 3, 2]
    test2 = [3, 2, 1]
    print(test1)
    shell_sort(test1)
    print(test1)
    print(test2)
    shell_sort(test2)
    print(test2)


if __name__ == '__main__':
    solve()
