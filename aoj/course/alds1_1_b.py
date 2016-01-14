def gcd(a, b):
    if (a == 0) or (b == 0):
        return 0
    else:
        while b:
            a, b = b, a % b
        return a


def main():
    a, b = input().strip().split()
    print(gcd(int(a), int(b)))


def test():
    gcd(54, 20) == 2
    gcd(147, 105) == 21


if __name__ == '__main__':
    main()
