def bubble_sort(arr, N):
    flag = True
    n_swap = 0

    while flag:
        flag = False
        for j in range(N - 1, 0, -1):
            if arr[j] < arr[j - 1]:
                arr[j], arr[j - 1] = arr[j - 1], arr[j]
                n_swap += 1
                flag = True
    return arr, n_swap


def main():
    N = int(input())
    arr = [int(i) for i in input().strip().split()]
    sorted_, n_swap = bubble_sort(arr, N)
    print(" ".join(map(str, sorted_)))
    print(n_swap)


if __name__ == '__main__':
    main()
