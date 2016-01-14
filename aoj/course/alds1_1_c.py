from math import sqrt


def is_prime(n):
    if n == 2:
        return True
    if n % 2 == 0 and n > 2:
        return False

    i = 3
    while i <= sqrt(n):
        if n % i == 0:
            return False
        i += 2
    return True


def main():
    N = int(input().strip())
    arr = [int(input().strip()) for i in range(N)]
    primes = [n for n in arr if is_prime(n)]
    print(len(primes))

if __name__ == '__main__':
    main()
