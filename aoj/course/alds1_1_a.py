def insertion_sort(arr):
    for i in range(len(arr)):
        key = arr[i]
        j = i - 1
        while (j >= 0) and (arr[j] > key):
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
        print(" ".join(map(str, arr)))
    return arr


def main():
    N = input()
    arr = [int(i) for i in input().strip().split()]
    sorted = insertion_sort(arr)


if __name__ == '__main__':
    main()
